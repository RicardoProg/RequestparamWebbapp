package com.ricardo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	
	@RequestMapping("/courses")
	public ModelAndView courses(@RequestParam("cname")String coursename) {
				
		/*
		HttpServletRequest req
		HttpSession session= req.getSession();
		String cname= req.getParameter("cname");
		System.out.println("The course name is: "+cname);
		session.setAttribute("cname", cname);*/
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("cname",coursename);
		mv.setViewName("course.jsp");
		return mv;
	}

}
