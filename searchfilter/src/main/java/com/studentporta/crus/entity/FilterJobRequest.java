package com.studentporta.crus.entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
public class FilterJobRequest {
	
	
	private String studentId;
	private Filter filter;
	
	
	public FilterJobRequest() {
		super();
	}
	public FilterJobRequest(String studentId, Filter filter) {
		super();
		this.studentId = studentId;
		this.filter = filter;
	}
	
	
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public Filter getFilter() {
		return filter;
	}
	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	@Override
	public String toString() {
		return "FilterJobRequest [studentId=" + studentId + ", filter=" + filter + "]";
	}

}
