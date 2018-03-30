package com.myspring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myspring.bean.Job;
import com.myspring.dao.JobDAO;

@Service
public class JobServiceImpl implements JobService {

	@Resource
	private JobDAO jobDAO;

	@Override
	public int getCountJobs() {
		return jobDAO.getJob();
	}

    @Override
    public List<Job> getJobs() {
        
        return jobDAO.getAllJob();
    }

}
