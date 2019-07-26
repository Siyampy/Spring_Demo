package com.springdemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demo_Controller 
{
	@RequestMapping("/sub")
	public String add()
	{
		return "display.jsp";
	}
//	Here we can also use the Annotation based Configuration instead of the xml
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("s1") String n,HttpServletRequest rq,HttpServletResponse rs)
	{
//		String n=rq.getParameter("s1").toString();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",n);
		return mv;
	}

	
}
