package is.hi.booksmart.controller;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import is.hi.booksmart.model.Book;
import is.hi.booksmart.model.Department;
import is.hi.booksmart.model.School;
import is.hi.booksmart.model.User;
import is.hi.booksmart.model.Course;
import is.hi.booksmart.services.BookService;
import is.hi.booksmart.services.CourseService;
import is.hi.booksmart.services.DepartmentService;
import is.hi.booksmart.services.SchoolService;
import is.hi.booksmart.services.UserService;

/**
 * @author Sævar Ingi Sigurðsson <sis108@hi.is>
 * @date October 2017 HBV501G Software Project 1
 * 
 *       Controller that dictates what is done when the user or UI sends an
 *       instruction.
 **/
@Controller
@RequestMapping("/app/") // Request Mapping so that every site starts with /app. 
public class SearchController 	{
	

	// Connection to service class(es).
	@Autowired
	BookService bookService;
	@Autowired
	SchoolService schoolService;
	@Autowired
	DepartmentService departmentService;
	@Autowired
	CourseService courseService;
	@Autowired
	UserService userService;
    
    /**
     * Display search form.
     * 
     * @return
     */
    @RequestMapping("")
    public String search() {
    		return "app/search";
    }
    
    /**
     * Display advanced search form.
     * 
     * @param model
     * @return
     */
    @RequestMapping("/adv_search")
    public String advSearch() {
    		return "app/advancedSearch";
    }
    
    /**
     * Display add Book form.
     * 
     * @return
     */
    @RequestMapping("/add_book")
    public String displayBookForm() {
    		return "app/addBook";
    }
    
    /**
     * Display add createUser page.
     * 
     * @return
     */
    @RequestMapping("/create_user")
    public String displayUserCreate() {
    		return "app/createUser";
    }
    
    
    /**
     * Add book to database.
     * 
     * @return
     */
    @RequestMapping(value = "/book_confirm", method = RequestMethod.POST)
    public String addBook(@RequestParam(value="title", required=true) String title,
    		                  @RequestParam(value="author", required=true) String author,
    		                  @RequestParam(value="edition", required=true) String edition,
    		                  @RequestParam(value="course", required=true) String course,
    		                  @RequestParam(value="department", required=true) String department,
    		                  @RequestParam(value="school", required=true) String school, 
    		                  @RequestParam(value="username", required=true) String username,
    		                  ModelMap model) {

    		int e = Integer.parseInt(edition);
    		User user = userService.getUserbyUsername(username);
    		School s = new School(school, "HÍ");
    		schoolService.save(s);
    		Department d = new Department(department, s);
    		departmentService.save(d);
    		Course c = new Course("ASDF", course, d);
    		courseService.save(c);
    		Book b = new Book(title, author, e, c, user);
    		
    		model.addAttribute("book", b);
    		bookService.save(b);
    		
    		return "app/bookAccept";
    }
    
    /**
     * Add user to database.
     * 
     * @return
     */
    @RequestMapping(value = "/user_confirm", method = RequestMethod.POST)
    public String createUser(@RequestParam(value="username", required=true) String username, 
    		                  @RequestParam(value="email", required=true) String email,
       		                  @RequestParam(value="pw", required=true) String pw,
    		                  ModelMap model) {
    		
    		User user = userService.getUserbyUsername(username);
    		
    		if (user != null) {
    			model.addAttribute("error", "Username already exists!");
    			return "app/createUser";
    		}
    		else {
    		User a = new User(username, email, pw);
    		userService.save(a);
    		model.addAttribute("user", a);
    		
    		return "app/addBook";
    		}
    }
    
    /**
     * Search for books by Title entered into form.
     * 
     * @param title
     * @param model
     * @return
     */
    @RequestMapping(value="/results", method=RequestMethod.GET)
    public String booksByTitle (@RequestParam(value="title") String title, Model model) {
    		ArrayList<Book> list;
    		list = (ArrayList<Book>) bookService.booksByTitle(title);
    		
    		model.addAttribute("books", list);
    		return "app/displayResults";
    }
    
    /**
     * Use advanced search (unfinished?).
     * 
     * @param title
     * @param edition
     * @param author
     * @param model
     * @return
     */
    @RequestMapping(value="/test", method=RequestMethod.GET)
    public String advSearch (@RequestParam(value="title", required=false) String title, 
    		                     @RequestParam(value="edition", required=false) String edition,
    		                     @RequestParam(value="author", required=false) String author, Model model) {
    		System.out.println(title + ", " + edition + ", " + author);
    		ArrayList<Book> list;
    		String nullStr = "";
    		
    		int ed;
    		if (edition == nullStr) ed = 0;
    		else ed = Integer.parseInt(edition);
    		
    		if (title != nullStr && ed != 0 && author != nullStr) {
    			list = (ArrayList<Book>) bookService.booksByTitleEditionAuthor(title, ed, author);
    		} else if (title != nullStr && ed != 0) {
    			list = (ArrayList<Book>) bookService.booksByTitleEdition(title, ed);
    		} else if (title != nullStr && author != nullStr) {
    			list = (ArrayList<Book>) bookService.booksByTitleAuthor(title, author);
    		} else if (author != nullStr && ed != 0) {
    			list = (ArrayList<Book>) bookService.booksByAuthorEdition(author, ed);
    		} else if (title != nullStr) {
    			list = (ArrayList<Book>) bookService.booksByTitle(title);
    		} else if (ed != 0) {
    			list = (ArrayList<Book>) bookService.booksByEdition(ed);
    		} else if (author != nullStr) {
    			list = (ArrayList<Book>) bookService.booksByAuthor(author);
    		} else {
    			list = (ArrayList<Book>) bookService.allBooks();
    		}
    		
    		
    		model.addAttribute("books", list);
    		return "app/displayResults";
    }
    
    /**
     * Display User homepage.
     */
    @RequestMapping(value="/homepage", method=RequestMethod.GET)
    public String homepage(@RequestParam(value="username") String username, Model model) {
    		model.addAttribute("user", username);
    		
    		ArrayList<Book> books = (ArrayList<Book>) bookService.booksByUsername(username);
    		model.addAttribute("books", books);
    		
    		return "app/userInventory";
    }
    
    /**
     * Delete book from database.
     */
    @RequestMapping(value="/kek", method=RequestMethod.GET)
    public String deleteBook(@RequestParam(value="book_id") String id,
    		                     @RequestParam(value="username") String username, Model model) {
    		long idNo = Long.parseLong(id);
    		System.out.println(username + " " + idNo);
    		model.addAttribute("user", username);
    		
    		Book book = bookService.bookById(idNo);
    		bookService.delete(book);
    		
    		ArrayList<Book> books = (ArrayList<Book>) bookService.booksByUsername(username);
    		model.addAttribute("books", books);
    		
    		return "app/userInventory";
    }
    
    /**
     * Test function.
     * 
     * @param model
     * @return
     */
    @RequestMapping(value="/lifir", method=RequestMethod.GET)
    public String lifir(Model model) {
    		if (bookService.isAlive()) {
    			return "app/search";
    		} else {
    			return "app/login";
    		}
    		
    }
     
 }
