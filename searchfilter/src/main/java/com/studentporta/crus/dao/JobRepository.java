package com.studentporta.crus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.studentporta.crus.entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {
	
	
	@Query("select jd from Job jd where (:company is null or jd.company = :company) and (:skill is null or jd.skill = :skill) and(:location is null or jd.location = :location) and (:experience is null or jd.experience = :experience) and (:type is null or jd.type = :type) " )
	public List<Job> getJobByFilter(@Param("company") String company,@Param("skill") String skill,@Param("location") String location,@Param("experience") String experience,@Param("type") String type);

	public List<Job> findByCompany(String companyName);
}

