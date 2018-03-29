package com.myspring.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myspring.service.JobService;

@Controller
@RequestMapping("/demo")
public class JobController {

	@Resource
	private JobService jobService;
	
	@RequestMapping(value="/index")
	public String index(){
		int count = jobService.getCountJobs();
		System.out.println(count);
		return "demo";
	}
}
