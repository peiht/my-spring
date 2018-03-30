package com.myspring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myspring.bean.Job;
import com.myspring.service.JobService;

@Controller
@RequestMapping("/demo")
public class JobController {

	@Resource
	private JobService jobService;
	
	@RequestMapping(value="/index")
	public String index(){
		//int count = jobService.getCountJobs();
		//System.out.println(count);
	    List<Job> jobs = jobService.getJobs();
	    System.out.println(jobs.size());
		return "demo";
	}
}
