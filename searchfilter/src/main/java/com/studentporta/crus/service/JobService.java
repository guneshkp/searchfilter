package com.studentporta.crus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentporta.crus.dao.JobRepository;
import com.studentporta.crus.entity.FilterJobRequest;
import com.studentporta.crus.entity.Job;

@Service
public class JobService {
	
	@Autowired
	private JobRepository jobRespository;
	
	public Job createJob(Job job) {
		
		return jobRespository.save(job);
		
		
	}

public List<Job> createJobs(List<Job> job) {
		
		return jobRespository.saveAll(job);
		
		
	}
public Job getUserById(int id) {
	return jobRespository.findById(id).orElse(null);
}


public List<Job> searchByFilter( FilterJobRequest filterObj) {
	List<Job> l = jobRespository.getJobByFilter(filterObj.getFilter().getCompanyName(),filterObj.getFilter().getSkill(),filterObj.getFilter().getLocation(),filterObj.getFilter().getExperience(),filterObj.getFilter().getType());
	return l;
}

public List<Job> searchJobs(FilterJobRequest filterObj) {
	List<Job> l = jobRespository.findByCompany(filterObj.getFilter().getCompanyName());
	return l;
}

}
