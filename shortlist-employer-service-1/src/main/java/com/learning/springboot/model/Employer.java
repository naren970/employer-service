package com.learning.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employer1")
public class Employer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@GeneratedValue
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//@Column(name="company_name")
	private String companyName;
	
	private String jobLocation;
	private String jobTitle;
	private float jobSalary;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public float getJobSalary() {
		return jobSalary;
	}
	public void setJobSalary(int jobSalary) {
		this.jobSalary = jobSalary;
	}
	
	public Employer() {
		super();
	}
	public Employer( int id, String companyName, String jobLocation, String jobTitle, float jobSalary) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.jobLocation = jobLocation;
		this.jobTitle = jobTitle;
		this.jobSalary = jobSalary;
	}
	
}
