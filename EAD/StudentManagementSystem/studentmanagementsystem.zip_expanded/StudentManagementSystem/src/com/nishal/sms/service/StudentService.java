package com.nishal.sms.service;

import java.util.List;

import com.nishal.sms.dto.StudentDto;

public interface StudentService {
	
public void saveStudentInfo(StudentDto studentDto);
	
	public void updateStudentInfo(StudentDto studentDto);
	
	public List<StudentDto> getAllStudentInfo();
	
	public void deleteStudentInfo(int id);
	
	public StudentDto getStudentById(int id);

}
