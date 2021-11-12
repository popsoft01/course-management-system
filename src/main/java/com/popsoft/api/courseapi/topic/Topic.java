package com.popsoft.api.courseapi.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String Decription;
	

	public Topic() {
		super();
	}
	
	public Topic(String id, String name, String decription) {
		super();
		this.id = id;
		this.name = name;
		Decription = decription;
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
