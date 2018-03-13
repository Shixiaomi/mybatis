package cn.shilt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.shilt.model.Student;
import cn.shilt.service.IStudentService;

@Controller
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	@RequestMapping("/getStudent")
	@ResponseBody
	public Object getStudent(HttpServletRequest req, HttpServletResponse reqs){
		
		int id = Integer.parseInt(req.getParameter("id"));
		Student student = studentService.getStudent(id);
		return student;
		
	}
}
