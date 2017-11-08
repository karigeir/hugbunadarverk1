package is.hi.booksmart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import is.hi.booksmart.model.User;
import is.hi.booksmart.services.UserService;

/**
 * @author Kári Geir Gunnarsson <kgg5@hi.is>
 * @date October 2017 HBV501G Software Project 1
 * 
 *       Controller that dictates what is done when the user or UI sends an
 *       instruction.
 **/

@Controller
@RequestMapping("/app")
public class LoginController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(@RequestParam(value = "error",required = false) String error,
	@RequestParam(required = false) String logout, ModelMap model) {

		model.addAttribute("loginPage");
		
		return "app/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginConfirm(HttpSession session, 
	@RequestParam(value="username", required=true) String username,
    @RequestParam(value="pw", required=true) String password,
	ModelMap model) {
		User user = userService.getUserbyUsername(username);
		
		if (user == null) {
			model.addAttribute("error", "Username not found");
			return "app/login";
		}
		
		if (!user.getPw().equals(password)) {
			model.addAttribute("error", "Wrong password. Try again.");
			return "app/login";
		}

		session.setAttribute("myUser", user);
		System.out.println(model.get("loggedIn"));
		
		return "redirect:./";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session, ModelMap model) {
		session.invalidate();
		return "app/search";
	}
	
}