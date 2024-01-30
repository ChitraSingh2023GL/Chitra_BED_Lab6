package com.greatLearning.eventManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.eventManagement.entity.Student;
import com.greatLearning.eventManagement.repository.StudentRepository;

@Service

public class StudentServiceImp implements StudentService {

	@Autowired
	StudentRepository studentRepostory;

	@Override
	public List<Student> getAllStudent() {
		List<Student> slist = studentRepostory.findAll();
		return slist;
	}

	@Override
	public Student saveStudent(Student st) {
		return studentRepostory.save(st);

	}

	@Override
	public Student getStudent(int studentid) {
		return studentRepostory.getById(studentid);
	}

	@Override
	public Student updateStudentDetail(Student st) {
		return studentRepostory.save(st);
	}

	@Override
	public void deleteStudent(int studentid) {
		studentRepostory.deleteById(studentid);

	}

	@Override
	public Student findById(int theId) {
		return studentRepostory.findById(theId).get();
	}

	@Override
	public void deleteById(int theId) {
		studentRepostory.deleteById(theId);

	}

	@Override
	public void save(Student theStudent) {
		studentRepostory.save(theStudent);

	}

}
