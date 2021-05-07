package com.studentporta.crus.entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
public class SearchRequestAccepted {
	
	private String url;
	
	public SearchRequestAccepted() {
		// TODO Auto-generated constructor stub
	}
	
	public SearchRequestAccepted(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "{ url:" + url + "}";
	}
	
}
