package com.sms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.util.DbUtil;
import com.sms.dto.StudentDto;

public class StudentDaoImpl implements StudentDao{

	PreparedStatement ps= null;
	@Override
	public void saveStudentInfo(StudentDto studentDto) {

		
		String sql = "INSERT into students(roll,name,college,department) values (?,?,?,?)";
		try {
			ps= DbUtil.getConnection().prepareStatement(sql);
			ps.setInt(1,studentDto.getRoll());
			ps.setString(2, studentDto.getName());
			ps.setString(3, studentDto.getCollege());
			ps.setString(4, studentDto.getDepartment());
			
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent(StudentDto studentDto) {

		String sql = "Update students SET name=?, roll=?, college=? ,departmnt=? WHERE id=?" ;
		try {
			ps= DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, studentDto.getName());
			ps.setInt(2,studentDto.getRoll());
			ps.setString(3, studentDto.getCollege());
			ps.setString(4, studentDto.getDepartment());
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<StudentDto> getStudents() {

		List<StudentDto> students=new ArrayList<>();
		String sql= "Select * from students";
		try {
			ps= DbUtil.getConnection().prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				StudentDto studentDto = new StudentDto();
				studentDto.setName(rs.getString("name"));
				studentDto.setCollege(rs.getString("college"));
				studentDto.setDepartment(rs.getString("department"));
				students.add(studentDto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
			
	}

	@Override
	public void delete(int id) {
		String sql = "Delete students WHERE id=?" ;
		try {
			ps= DbUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public StudentDto getStudentById(int id) {
		// TODO Auto-generated method stub
		StudentDto studentDto = new StudentDto();
		String sql= "Select * from students WHERE id=?";
		try {
			ps= DbUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
			
				studentDto.setName(rs.getString("name"));
				studentDto.setCollege(rs.getString("college"));
				studentDto.setDepartment(rs.getString("department"));
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentDto;
	}

}
