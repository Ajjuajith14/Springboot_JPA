package com.giri1.springboot.LearnSpringJPA.Course.SpringDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giri1.springboot.LearnSpringJPA.Course.Course;
 
public interface CourseSpringDataJpa extends JpaRepository <Course, Integer>{
	
	

}
