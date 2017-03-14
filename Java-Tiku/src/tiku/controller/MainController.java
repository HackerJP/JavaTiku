package tiku.controller;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tiku.dao.UserDao;
import tiku.domain.User;

@Controller
public class MainController {
	private static final Log logger = 
			LogFactory.getLog(MainController.class);
	
	@GetMapping(value="/main")
	public String mainForm() {
		logger.info("inputLogin called");
		return "main";
	}
	
	@PostMapping(value="/main")
	public String mainPost(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("password") String
			password) {
		return "longinFaillure";
}
}
