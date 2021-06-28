package com.axsos.login_registration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.login_registration.models.User;
import com.axsos.login_registration.services.UserService;

@Controller
public class UserController {
	final private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/registration")
	public String register(@ModelAttribute("user") User user) {
		return "users/registrationPage.jsp";
	}

	@RequestMapping("/login")
	public String login() {
		return "users/loginPage.jsp";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "users/registrationPage.jsp";
		} else {
			User u =userService.registerUser(user);
			session.setAttribute("userId", u.getId());
			return "redirect:/home";
		}
	}
	
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session
    	boolean isAuth= userService.authenticateUser(email, password);
    	if (isAuth) {
    		User user =userService.findByEmail(email);
    		session.setAttribute("userId", user.getId());
			model.addAttribute("user",user);
			return "redirect:/home";
		}else {
			model.addAttribute("error","Invalid Credantials, please try again");
			return "users/loginPage.jsp";
		}
    	
        // else, add error messages and return the login page
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page

    	Long userId= (Long) session.getAttribute("userId");
    	User u=userService.findUserById(userId);
    	model.addAttribute("user",u);
    	return"users/homePage.jsp";
    	
    }
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
    	session.invalidate();
        // redirect to login page
    	return "redirect:/login";
    }
}
