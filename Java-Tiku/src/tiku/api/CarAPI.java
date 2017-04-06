package tiku.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
public class CarAPI {
	private static final Log logger = 
			LogFactory.getLog(CarAPI.class);
	
	@RequestMapping(value="/cartapi", method=RequestMethod.GET)
	public void cartApi(HttpServletRequest request, HttpSession session, @RequestParam("eid") String eid, @RequestParam("op") String operation) {
		//如果session中没有ecart购物车列表，则新建一个
		if(session.getAttribute("ecart")==null){
			List<Exercises> ecart = new LinkedList<Exercises>();
			session.setAttribute("ecart", ecart);
		}
		//获得购物车列表
		List<Exercises> ecart = (List<Exercises>) session.getAttribute("ecart");
		
	}
}

