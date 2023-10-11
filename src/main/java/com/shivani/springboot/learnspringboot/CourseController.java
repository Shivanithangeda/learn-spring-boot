package com.shivani.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//courses
//building restAPI 
//course: id,name,author
@RestController
public class CourseController {
	
	@RequestMapping("/courses")
    public List<Course> retriveAllCourses(){
    	return Arrays.asList(
    			new Course(1,"Learn AWS","in28minutes"),
    			new Course(2,"Learn Devops ","in28minutes"),
    			new Course(3,"aws ","in28minutes")
    			);
    }
	
}
