package cn.shilt.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
		Student student = new Student();
		student.setId(paramResultSet.getInt("id"));
		student.setName(paramResultSet.getString("name"));
		student.setCode(paramResultSet.getString("code"));
		return student;
	}

}
