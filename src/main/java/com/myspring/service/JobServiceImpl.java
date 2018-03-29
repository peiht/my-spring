package com.myspring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myspring.dao.JobDAO;

@Service
public class JobServiceImpl implements JobService {

	@Resource
	private JobDAO jobDAO;

	@Override
	public int getCountJobs() {
		return jobDAO.getJob();
	}

}
