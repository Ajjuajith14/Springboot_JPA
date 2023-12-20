package com.giri1.springboot.LearnSpringJPA.CourseJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.giri1.springboot.LearnSpringJPA.Course.Course;



@Repository
public class CourseRepository 
{
	@Autowired
	private JdbcTemplate springj;
	
	private static String INSERT_QUERY =
		"""
			insert into course(id, name, author)
			values(?,?,?);
			
		""";
	
	private static String DELETE_QUERY =
			"""
				delete from course
				where id = ?;
				
			""";
	
	private static String SELECT_QUERY =
			"""
				select * from course
				where id = ?
				
			""";
	
	public void insert(Course course) {
		springj.update(INSERT_QUERY, course.getId(),course.getName(),course.getAuthor());
	}
	
	public void delete(int id)
	{
		springj.update(DELETE_QUERY, id); 
	}
	
	public Course findId(int id)
	{
		return springj.queryForObject(SELECT_QUERY,
				          new BeanPropertyRowMapper<>(Course.class),id);
	}
	

}
