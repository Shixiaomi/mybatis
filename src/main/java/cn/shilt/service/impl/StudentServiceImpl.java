package cn.shilt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.shilt.dao.IStudentDao;
import cn.shilt.model.Student;
import cn.shilt.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao studentDao;
	
	@Override
	public Student getStudent(int id) {
		
		return studentDao.getStudentById(id);
	}

}
