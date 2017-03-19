package tiku.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import tiku.dao.ExercisesDao;
import tiku.dao.UserDao;
import tiku.domain.Exercises;
import tiku.domain.User;

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
	public String login(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("password") String
			password, Model model) {
		logger.info("login request called");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userdao = (UserDao) context.getBean("UserDao");
		User user = new User(username, password);
		if( userdao.checkUser(user)) {
			ExercisesDao exercisesDao = (ExercisesDao) context.getBean("ExercisesDao");
			List<Exercises> exercisesList = exercisesDao.findAll();
			List<Exercises> exercisesView = new ArrayList<Exercises>();
			for(int i=0; i<10; i++) {
				exercisesView.add(exercisesList.get(i));
			}
			model.addAttribute("exercises", exercisesView);
			//System.out.print(exercisesView.get(1).getEanswer());
			return "main";
		}
		return "loginFaillure";
	}
	
	
}
