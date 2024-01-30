package com.greatLearning.eventManagement.service;

import java.util.List;
import com.greatLearning.eventManagement.entity.*;

public interface StudentService {
	List<Student> getAllStudent();

	Student saveStudent(Student st);

	Student getStudent(int studentid);

	Student updateStudentDetail(Student st);

	void deleteStudent(int studentid);

	Student findById(int theId);

	void deleteById(int theId);

	void save(Student theStudent);

}
