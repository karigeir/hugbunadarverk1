package is.hi.booksmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import is.hi.booksmart.model.User;
import is.hi.booksmart.services.UserService;

@Controller
@RequestMapping("/app")
public class LoginController {

//	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
//	public ModelAndView welcomePage() {
//		ModelAndView model = new ModelAndView();
//		model.setViewName("welcomePage");
//		return model;
//	}
//
//	@RequestMapping(value = { "/homePage"}, method = RequestMethod.GET)
//	public ModelAndView homePage() {
//		ModelAndView model = new ModelAndView();
//		model.setViewName("homePage");
//		return model;
//	}
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(@RequestParam(value = "error",required = false) String error,
	@RequestParam(value = "logout",	required = false) String logout, ModelMap model) {

		if (error != null) {
			model.addAttribute("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			model.addAttribute("message", "Logged out from JournalDEV successfully.");
		}

//		model.addAttribute("loginPage");
		return "app/login";
	}
	
	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
	public String loginConfirm(@RequestParam(value = "error",required = false) String error,
	@RequestParam(value = "logout",	required = false) String logout, 
	@RequestParam(value="username", required=true) String username,
    @RequestParam(value="pw", required=true) String password,
	ModelMap model) {
		User user = userService.getUserbyUsername(username);
		
		if (user == null) {
			model.addAttribute("error", "No user found");
			return "app/login";
		}
		
		if (!user.getPw().equals(password)) {
			model.addAttribute("error", "Invalid Credentials provided.");
			return "app/login";
		}

		if (logout != null) {
			model.addAttribute("message", "Logged out from JournalDEV successfully.");
		}

//		model.addAttribute("loginPage");
		return "app/search";
	}
}