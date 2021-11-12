package com.popsoft.api.courseapi.course;

//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.popsoft.api.courseapi.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	public CourseService courseService;
	
	@RequestMapping("/topics/{id}/course")
	public List<Course> getAllCourse(@PathVariable String id){
		return courseService.getAllCourse(id);
		
	}
	
	@RequestMapping("/topics/{topicId}/course/{id}")
	public Optional<Course> getCourse(@PathVariable String id){
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,	value ="/topics/{topicId}/course")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId){
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/topics/{topicId}/course/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String id,@PathVariable String topicId ){
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/course/{id}")	
	public void deleteCourse(@PathVariable String id){
		courseService.deleteCourse(id);;
	}



}
