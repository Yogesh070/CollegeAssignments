package com.sms.dao;

import java.util.List;

import com.sms.dto.StudentDto;

public interface StudentDao {
	
	public  void saveStudentInfo(StudentDto studentDto);
	
	public void updateStudent(StudentDto studentDto);
	
	public List<StudentDto> getStudents();
	
	public void delete(int id); 
	
	public StudentDto getStudentById(int id);
}

