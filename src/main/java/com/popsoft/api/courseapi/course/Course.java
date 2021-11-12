package com.popsoft.api.courseapi.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.popsoft.api.courseapi.topic.Topic;

import lombok.Data;
@Data
@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String Decription;
	
	@ManyToOne
	private Topic topic;
	

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course() {
		super();
	}
	
	public Course(String id, String name, String decription, String topicId) {
		super();
		this.id = id;
		this.name = name;
		Decription = decription;
		this.topic = new Topic(id, "","");
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
