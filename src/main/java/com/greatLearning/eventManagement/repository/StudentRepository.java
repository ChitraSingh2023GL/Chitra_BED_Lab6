package com.greatLearning.eventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatLearning.eventManagement.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
