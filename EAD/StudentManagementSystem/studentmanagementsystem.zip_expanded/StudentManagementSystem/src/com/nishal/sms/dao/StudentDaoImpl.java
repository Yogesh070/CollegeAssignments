package com.nishal.sms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nishal.sms.dto.StudentDto;
import com.nishal.sms.util.DbUtil;

public class StudentDaoImpl implements StudentDao {
	
	PreparedStatement ps=null;

	@Override
	public void saveStudentInfo(StudentDto studentDto) {
		String sql = "INSERT into student_details(student_name, college_name, subject, email, departments, gender, roll, dob)values(?,?,?,?,?,?,?,?)";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, studentDto.getStudentName());
			ps.setString(2, studentDto.getCollegeName());
			ps.setString(3, studentDto.getSubject());
			ps.setString(4, studentDto.getEmail());
			ps.setString(5, studentDto.getDepartments());
			ps.setString(6, studentDto.getGender());
			ps.setInt(7, studentDto.getRoll());
			ps.setDate(8, new java.sql.Date(studentDto.getDob().getTime()));
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudentInfo(StudentDto studentDto) {
		String sql = "UPDATE student_details SET  student_name=?, college_name=?, subject=?, email=?, departments=?, gender=?, roll=?, dob=? where id = ?";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, studentDto.getStudentName());
			ps.setString(2, studentDto.getCollegeName());
			ps.setString(3, studentDto.getSubject());
			ps.setString(4, studentDto.getEmail());
			ps.setString(5, studentDto.getDepartments());
			ps.setString(6, studentDto.getGender());
			ps.setInt(7, studentDto.getRoll());
			ps.setDate(8, new java.sql.Date(studentDto.getDob().getTime()));
			ps.setInt(9, studentDto.getId());
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<StudentDto> getAllStudentInfo() {
		List<StudentDto>  studentList = new ArrayList<>();
		String sql="select * from student_details";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				StudentDto studentDto = new StudentDto();
				studentDto.setStudentName(rs.getString("student_name"));
				studentDto.setCollegeName(rs.getString("college_name"));
				studentDto.setEmail(rs.getString("email"));
				studentDto.setDepartments(rs.getString("departments"));
				studentDto.setGender(rs.getString("gender"));
				studentDto.setRoll(rs.getInt("roll"));
				studentDto.setDob(rs.getDate("dob"));
				studentDto.setSubject(rs.getString("subject"));
				studentDto.setId(rs.getInt("id"));
				studentList.add(studentDto);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		return studentList;
	}

	@Override
	public void deleteStudentInfo(int id) {
		String sql = "DELETE from student_details where id=?";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public StudentDto getStudentById(int id) {
		StudentDto studentDto = new StudentDto();
		String sql="select * from student_details where id=?";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				studentDto.setStudentName(rs.getString("student_name"));
				studentDto.setCollegeName(rs.getString("college_name"));
				studentDto.setEmail(rs.getString("email"));
				studentDto.setDepartments(rs.getString("departments"));
				studentDto.setGender(rs.getString("gender"));
				studentDto.setRoll(rs.getInt("roll"));
				studentDto.setDob(rs.getDate("dob"));
				studentDto.setSubject(rs.getString("subject"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		return studentDto;
	}

}
