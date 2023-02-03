package com.nishal.sms.service;

import java.util.List;

import com.nishal.sms.dao.StudentDao;
import com.nishal.sms.dao.StudentDaoImpl;
import com.nishal.sms.dto.StudentDto;

public class StudentServiceImpl implements StudentService {
	
	StudentDao studentDao = new StudentDaoImpl();

	@Override
	public void saveStudentInfo(StudentDto studentDto) {
		//
		studentDao.saveStudentInfo(studentDto);
	}

	@Override
	public void updateStudentInfo(StudentDto studentDto) {
		studentDao.updateStudentInfo(studentDto);
	}

	@Override
	public List<StudentDto> getAllStudentInfo() {
		return studentDao.getAllStudentInfo();
	}

	@Override
	public void deleteStudentInfo(int id) {
		studentDao.deleteStudentInfo(id);
	}

	@Override
	public StudentDto getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

}
