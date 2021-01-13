package main.java.com.ezydemo.ezypay.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.com.ezydemo.ezypay.model.UserInfo;
import main.java.com.ezydemo.ezypay.service.SecurityService;
import main.java.com.ezydemo.ezypay.service.UserService;
import main.java.com.ezydemo.ezypay.validator.UserValidator;




@Controller
public class FormProcessController {	
	
	
	@Autowired
	private UserService userService;
	
	@Autowired 	
	private UserValidator userValidator;
	
	@Autowired
	private SecurityService securityService;
	
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

	
	 @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
	    public String welcome(Model model) {
	        return "welcome";
	    }

	 
	 
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String registration(Model model) {
	        model.addAttribute("userForm", new UserInfo());

	        return "registration";
	    }

	    @RequestMapping(value = "/subscription", method = RequestMethod.POST)
	    public String subscription(@ModelAttribute("userForm") UserInfo userForm, BindingResult bindingResult, Model model) {
	        userValidator.validate(userForm, bindingResult);

	        if (bindingResult.hasErrors()) {
	            return "subscription";
	        }

	        userService.save(userForm);

	        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

	        return "redirect:/welcome";
	    }

	
	
	
	
	
	
	
	
    }
