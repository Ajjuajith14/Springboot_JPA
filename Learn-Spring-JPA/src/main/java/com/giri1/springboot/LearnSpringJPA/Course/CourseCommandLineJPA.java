package com.giri1.springboot.LearnSpringJPA.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.giri1.springboot.LearnSpringJPA.Course.SpringDataJpa.CourseSpringDataJpa;
import com.giri1.springboot.LearnSpringJPA.CourseJDBC.CourseRepository;
import com.giri1.springboot.LearnSpringJPA.CourseJPA.CourseJPA_Repositary;

@Component
public class CourseCommandLineJPA implements CommandLineRunner{

//	@Autowired
//	private CourseRepository repository;
	
//	@Autowired
//	private CourseJPA_Repositary repository;
	
	@Autowired
	public CourseSpringDataJpa repositary;
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//For JDBC and JPA
//		repositary.insert(new Course(1, "Learn Spring", "in28mins"));
//		repositary.insert(new Course(2, "Learn Spring_boot", "in28mins"));
//		repositary.insert(new Course(3, "Learn Spring_JPA1", "in28mins"));
//		
//		repositary.deleteId(1);
//		
//		System.out.println(repositary.findID(3));
//		System.out.println(repositary.findID(2));
		
		//For SpringDataJPA
		repositary.save(new Course(1, "Learn Spring", "in28mins"));
		repositary.save(new Course(2, "Learn Spring_boot", "in28mins"));
		repositary.save(new Course(3, "Learn Spring_JPA1", "in28mins"));
		repositary.deleteById(1);
		
		System.out.println(repositary.findById(3));
		System.out.println(repositary.findById(2));
		
		System.out.println(repositary.findAll());


		
	}
	
	

}
