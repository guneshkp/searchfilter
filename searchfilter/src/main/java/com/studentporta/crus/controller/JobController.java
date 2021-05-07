package com.studentporta.crus.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.studentporta.crus.dao.JobRepository;
import com.studentporta.crus.entity.FilterJobRequest;
import com.studentporta.crus.entity.Job;
import com.studentporta.crus.entity.SearchRequestAccepted;
import com.studentporta.crus.entity.SearchResponse;
import com.studentporta.crus.service.JobService;

@RestController
public class JobController {

	 @Autowired
	 private JobService jobService;
	 
	 @PostMapping("/addJob")
	 public Job addJob(@RequestBody Job job) {
		 
		 return jobService.createJob(job);
		  
	 }
	 
	 
	 @PostMapping("/addJobs")
	 public List<Job> addJobs(@RequestBody List<Job> jobs) {
		 
		 return jobService.createJobs(jobs);
		  
	 }
	 
	 @GetMapping("/job/{id}")
	 public Job getJobById(@PathVariable int id) {
		 
		 return jobService.getUserById(id);
		 
	 }
	 
	 @PostMapping("/jobs/search")
	 public ResponseEntity<String> searchJobs(@RequestBody FilterJobRequest filterObj) {
		 
		 List<Job> l = jobService.searchByFilter(filterObj);
		 File temp=null;
		 System.out.print(l);
		 
		 UUID uid = UUID.randomUUID();
		 // create a unique ID
		try {
			temp= File.createTempFile(uid.toString(), "");
		} catch (IOException e) {
	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Files.write(Paths.get(temp.getAbsolutePath()), jobListToStr1( new SearchResponse(l)).getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 // make a file with ID temp dir
		 // write the list of jobs in this file
		 SearchRequestAccepted s=  new SearchRequestAccepted("/jobs/search/" + temp.getName());
		 return new ResponseEntity<>( s.toString(), HttpStatus.ACCEPTED);
	 }
	 
	 
	 @GetMapping("/jobs/search/{id}")
	 public String searchJobs(@PathVariable String id) throws IOException {
		 // look for a file with this search id in the temp dir, if found return the contets, else return 404 
		 Path t = Files.createTempFile("", "");
		 String s = new String(Files.readAllBytes(Paths.get(t.getParent() + File.separator + id	))) ;
		 return s;
	 }
	 
	 public static String jobListToStr(List<Job> l) throws JsonProcessingException {
		 ObjectMapper objectMapper = new ObjectMapper();
		 objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		 String carAsString = objectMapper.writeValueAsString(l);
		 return carAsString;
	 }
	 
	 public static String jobListToStr1(SearchResponse response) throws JsonProcessingException {
		 ObjectMapper objectMapper = new ObjectMapper();
		 objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

		 String carAsString = objectMapper.writeValueAsString(response);
		 return carAsString;
	 }
	 
}
