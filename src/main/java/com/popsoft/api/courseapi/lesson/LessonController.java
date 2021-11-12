package com.popsoft.api.courseapi.lesson;

//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.popsoft.api.courseapi.course.Course;

@RestController
public class LessonController {
	
	@Autowired
	public LessonService courseService;
	
	@RequestMapping("/topics/{id}/course/{courseId}/lesson")
	public List<Lesson> getAllCourse(@PathVariable String id){
		return courseService.getAllCourse(id);
		
	}
	
	@RequestMapping("/topics/{topicId}/course/{id}/lesson/{lessonId}")
	public Optional<Lesson> getLesson(@PathVariable String id){
		return courseService.getLesson(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,	value ="/topics/{topicId}/course/{courseId}/lesson")
	public void addCourse(@RequestBody Lesson lesson, @PathVariable String courseId){
		lesson.setCourse(new Course(courseId,"","",""));
		courseService.addLesson(lesson);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/topics/{topicId}/course/{id}/lesson/{lessonId}")
	public void updateCourse(@RequestBody Lesson course,@PathVariable String id,@PathVariable String topicId ){
		course.setCourse(new Course(topicId,"","",""));
		courseService.updateLesson(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/course/{id}/lesson/{lessonId}")	
	public void deleteCourse(@PathVariable("lessonId") String id){
		courseService.deleteLesson(id);;
	}



}
