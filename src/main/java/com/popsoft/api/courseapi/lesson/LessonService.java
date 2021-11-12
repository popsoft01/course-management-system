package com.popsoft.api.courseapi.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	

	@Autowired
	private LessonRepository lessonRepository;
	
	
	public List<Lesson> getAllCourse(String topicId){
		List<Lesson> course = new ArrayList<>();
		lessonRepository.findByCourseId(topicId)
		.forEach(course::add);
		return course;
	}
	
	public Optional<Lesson> getLesson(String id) {
		return lessonRepository.findById(id);
		
	}
	
	public void addLesson(Lesson course) {
		lessonRepository.save(course);
	}
	
	public void updateLesson(Lesson course) {
		lessonRepository.save(course);	
	}
	
	public void deleteLesson(String id) {
		lessonRepository.deleteById(id);
	}
}
