package com.giri1.springboot.LearnSpringJPA.CourseJPA;

import org.springframework.stereotype.Repository;

import com.giri1.springboot.LearnSpringJPA.Course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

//import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class CourseJPA_Repositary {
	
	@PersistenceContext
	public EntityManager entityManager;
	
	public void insert(Course course)
	{
		entityManager.merge(course);
		
	}
	
	public Course findID(int id)
	{
		return entityManager.find(Course.class,id);
	}
	
	public void deleteId(int id)
	{
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
		
	}
	

}
