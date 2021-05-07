package com.studentporta.crus.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity(name="Job")
public class Job {

	
	@Id
	@GeneratedValue
	private int id;
	private String company;
	private String location;
	private String experience;
	private String type;
	private String contact;
	private String skill;
	private String description;
	
	
	
	public Job(int id, String companyName, String location, String experience, String type, String contact, String skill,
			String description) {
		super();
		this.id = id;
		this.company = companyName;
		this.location = location;
		this.experience = experience;
		this.type = type;
		this.contact = contact;
		this.skill = skill;
		this.description = description;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Job [id=" + id + ", company=" + company + ", location=" + location + ", experience=" + experience
				+ ", type=" + type + ", contact=" + contact + ", skill=" + skill + ", description=" + description + "]";
	}
	
	
	
	public Job() {
		super();
	}




	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
