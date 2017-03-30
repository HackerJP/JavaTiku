package tiku.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import com.sun.media.jfxmedia.logging.Logger;

import tiku.domain.User;
import tiku.dao.UserDao;

@Controller
public class RegisterController {
	private static final Log logger = 
			LogFactory.getLog(LoginController.class);
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register() {
		logger.info("inputRegister called");
		return "registerForm";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("password") String
			password, @RequestParam("userid") String userid, @RequestParam("userinfo") String userinfo) {
		logger.info("inputRegister called");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userdao = (UserDao) context.getBean("UserDao");
		User user = new User(userid, username, password, userinfo);
		userdao.insert(user);
		return "loginForm";
	}
}
