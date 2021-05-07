package com.studentporta.crus.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class SearchResponse {

	private List<Job> jobList;

	public SearchResponse(List<Job> jobList) {
		super();
		this.jobList = jobList;
	}

	public SearchResponse() {
		super();
	}

	public List<Job> getJobList() {
		return jobList;
	}

	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}

	public String toJsonString() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		 objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

		String jobListStr = objectMapper.writeValueAsString(jobList);
		return jobListStr;
	}

}
