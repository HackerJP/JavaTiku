package tiku.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.sun.media.jfxmedia.logging.Logger;

import tiku.domain.User;
import tiku.form.LoginForm;
import tiku.form.RegisterForm;

@Controller
public class LoginController{
	private static final Log logger = 
			LogFactory.getLog(LoginController.class);
	
	@GetMapping(value="/login")
	public String loginForm() {
		logger.info("inputLogin called");
		return "loginForm";
	}
	
	@PostMapping(value="/login")
	public String login(LoginForm loginForm, Model model) {
		logger.info("login request called");
		User user = new User();
		user.setUsername(loginForm.getUsername());
		user.setPassword(loginForm.getPassword());
		model.addAttribute("user", user);
		return "loginSuccess";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register() {
		logger.info("inputRegister called");
		return "index";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(RegisterForm registerForm, Model model) {
		logger.info("inputRegister called");
		User user = new User();
		user.setUsername(registerForm.getUsername());
		user.setPassword(registerForm.getPassword());
		model.addAttribute("user", user);
		return "index";
	}
}
