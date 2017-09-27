package is.hi.booksmart.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import is.hi.booksmart.model.Book;
import is.hi.booksmart.services.BooksMartServiceImp;

/**
 * @author Sævar Ingi Sigurðsson <sis108@hi.is>
 * 
 * Controller that dictates what is done when the user or UI sends an instruction.
 */

@Controller
@RequestMapping("/app") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /demo fyrir allar skipanir 
public class SearchController 	{
	
	BooksMartServiceImp bsm = new BooksMartServiceImp();
	
    /**
     * Sýnidæmi
     * @return
     */
    @RequestMapping("/page")
    public String demoPage(){
        return "demo/demo"; // skilar .jsp skrá sem er /webapp/WEB-INF/vefvidmot/demo/demo.jsp
                            // skoðið application.properties til að sjá hvernig slóðin er sett
    }
    
    /**
     * Spyr hvað notandinn heitir.
     * 
     * @return
     */
    @RequestMapping("/search")
    public String search() {
    		return "demo/search";
    }

    /**
     * Tekur við nafni á bók og birtir bókina".
     * @param nafn - Nafn á bók.
     * @param model - Model með attributes.
     * @return
     */
    @RequestMapping(value="/results", method=RequestMethod.POST)
    public ModelAndView displayResults(@RequestParam("title")String title, @RequestParam("author")String author,
    						@RequestParam("edition")int edition, @RequestParam("course")String course,
    						@RequestParam("department")String dept, @RequestParam("school")String school) {
    		ArrayList<Book> list = bsm.getBookByTitle(title);
    		return new ModelAndView("displayResult", "list", list);
    }

}

