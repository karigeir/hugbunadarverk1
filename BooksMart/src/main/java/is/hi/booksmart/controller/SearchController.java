package is.hi.booksmart.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
 * @date October 2017
 * HBV501G Software Project 1
 * 
 * Controller that dictates what is done when the user or UI sends an instruction.
**/
@Controller
@RequestMapping("/app") // Request Mapping so that every site starts with /app. 
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
     * Demo (to be removed later).
     * 
     * @return
     */
    @RequestMapping("/page")
    public String demoPage(){
        return "app/demo";
    }
    
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
    		                  @RequestParam(value="email", required=true) String email,
    		                  ModelMap model) {

    		int e = Integer.parseInt(edition);
    		School s = new School(school, "HÍ");
    		schoolService.save(s);
    		Department d = new Department(department, s);
    		departmentService.save(d);
    		Course c = new Course("ASDF", course, d);
    		courseService.save(c);
    		Book b = new Book(title, author, e, c, email);
    		
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

    		User a = new User(username, email, pw );
    		userService.save(a);
    		model.addAttribute("user", a);
    		userService.save(a);
    		
    		return "app/userAccept";
    }
    
    @RequestMapping(value="/results", method=RequestMethod.GET)
    public String booksByTitle (@RequestParam(value="title") String title, Model model) {
    		ArrayList<Book> list;
    		list = (ArrayList<Book>) bookService.booksByTitle(title);
    		model.addAttribute("books", list);
    		return "app/displayResults";
    }
    
    
 }
