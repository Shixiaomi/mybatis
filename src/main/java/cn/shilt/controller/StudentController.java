package cn.shilt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.shilt.model.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/getStudent")
	@ResponseBody
	public Object getStudent(HttpServletRequest req, HttpServletResponse reqs){
		Student student = new Student();
		student.setCode("110");
		student.setId(1);
		student.setName("shilt");
		return student;
		
	}
}
