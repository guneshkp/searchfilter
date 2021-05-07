package com.studentporta.crus.entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
public class Filter {
	
	public String experience;
    public String type;
    public String skill;
    public String company;
    public String location;
    
    
    public Filter() {
		super();
	}
	public Filter(String experience, String type, String skill, String companyName, String location) {
		super();
		this.experience = experience;
		this.type = type;
		this.skill = skill;
		this.company = companyName;
		this.location = location;
	}
    
    
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Filter [experience=" + experience + ", type=" + type + ", skill=" + skill + ", companyName="
				+ company + ", location=" + location + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCompanyName() {
		return company;
	}
	public void setCompanyName(String companyName) {
		this.company = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
