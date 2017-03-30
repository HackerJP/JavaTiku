package tiku.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoader;

import tiku.config.CreateSqlSession;
import tiku.dao.ExercisesDao;
import tiku.dao.UserDao;
import tiku.domain.Exercises;
import tiku.domain.User;
import tiku.config.CreateSqlSession;

@Controller
public class MainController {
	private static final Log logger = 
			LogFactory.getLog(MainController.class);
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String mainForm(HttpServletRequest request, @ModelAttribute("page") int page, Model model) throws IOException {
		logger.info("Show Main Page");
		// 获得应用的上下文
		ApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		
		if(!model.containsAttribute("exercises")) {
			// 通过自定义类得到SqlSession
			SqlSession sqlSession = CreateSqlSession.getSqlSession();
			// 实现exercisesDao接口
			ExercisesDao exercisesDao = sqlSession.getMapper(ExercisesDao.class);
			// 根据page计算出应显示的10条记录的起点值index
			int index = (page-1)*10;
			// 通过exercisesDao中的selectByPage方法取出10条记录
			List<Exercises> exercisesView = exercisesDao.selectByPage(index);
			
			model.addAttribute("exercises", exercisesView);
		}
		return "main";
	}
	
	@RequestMapping(value="/main", method=RequestMethod.POST)
	public String mainPost(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("password") String
			password) {
		return "longinFaillure";
}
} 
