package com.popsoft.api.courseapi.lesson;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.popsoft.api.courseapi.course.Course;
import lombok.Data;
@Data
@Entity
public class Lesson {
	
	@Id
	private String id;
	private String name;
	private String Decription;
	
//	@ManyToOne
//	private Topic topic;
	
	@ManyToOne
	private Course course;
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Lesson() {
		super();
	}
	
	public Lesson(String id, String name, String decription, String courseId) {
		super();
		this.id = id;
		this.name = name;
		Decription = decription;
		this.course = new Course(id, "","",courseId);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDecription() {
		return Decription;
	}
	public void setDecription(String decription) {
		Decription = decription;
	}
}
