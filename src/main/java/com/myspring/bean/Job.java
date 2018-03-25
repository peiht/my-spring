package com.myspring.bean;

import java.io.Serializable;

public class Job implements Serializable {

	private static final long serialVersionUID = 1L;
	private int jobId;
	private String jobSalary;
	private String jobName;
	private String jobAddress;
	private String jobRequire;
	private String jobCompany;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobSalary() {
		return jobSalary;
	}
	public void setJobSalary(String jobSalary) {
		this.jobSalary = jobSalary;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobAddress() {
		return jobAddress;
	}
	public void setJobAddress(String jobAddress) {
		this.jobAddress = jobAddress;
	}
	public String getJobRequire() {
		return jobRequire;
	}
	public void setJobRequire(String jobRequire) {
		this.jobRequire = jobRequire;
	}
	public String getJobCompany() {
		return jobCompany;
	}
	public void setJobCompany(String jobCompany) {
		this.jobCompany = jobCompany;
	}
	
}
