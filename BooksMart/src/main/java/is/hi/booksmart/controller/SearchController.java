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
import is.hi.booksmart.services.BookService;

/**
 * @author Sævar Ingi Sigurðsson <sis108@hi.is>
 * @date October 2017
 * HBV501G Software Project 1
 * 
 * Controller that dictates what is done when the user or UI sends an instruction.
 */

@Controller
@RequestMapping("/app") // Request Mapping so that every site starts with /app. 
public class SearchController 	{
	
	// Connection to service class(es).
	//@Autowired
	BookService bookService;
	
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
    @RequestMapping("/search")
    public String search() {
    		return "app/search";
    }
    
    /**
     * Display list of all books in database.
     * 
     * @param model - Model for UI communication.
     * @return Website containing a list of books.
     */
    @RequestMapping(value="/results", method=RequestMethod.GET)
    public String allBooks(Model model) {
    		ArrayList<Book> list;
    		list = (ArrayList<Book>) bookService.allBooks();
    		model.addAttribute("books", list);
    		return "app/displayResults";
    }
 }
