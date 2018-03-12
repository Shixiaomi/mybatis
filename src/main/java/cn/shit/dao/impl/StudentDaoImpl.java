package cn.shit.dao.impl;

import cn.shilt.dao.IStudentDao;
import cn.shilt.model.Student;

public class StudentDaoImpl implements IStudentDao{

	@Override
	public Student getStudentById(int id) {
		String sql = "select * from student where id ="+id;
		
		return null;
	}

}
