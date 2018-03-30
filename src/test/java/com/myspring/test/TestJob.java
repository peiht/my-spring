package com.myspring.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.myspring.Utils.MyBatisUtil;
import com.myspring.bean.Job;
import com.myspring.dao.JobDAO;

import junit.framework.Assert;

public class TestJob {

	@Test
	public void getJob(){
		SqlSession session = MyBatisUtil.getSession();
		JobDAO jobdao = session.getMapper(JobDAO.class);
		int count = jobdao.getJob();
		Assert.assertEquals(450,count );
	}
	
	@Test
	public List<Job> getAllJob() {
	    SqlSession session = MyBatisUtil.getSession();
	    JobDAO jobDAO = session.getMapper(JobDAO.class);
	    List<Job> job = jobDAO.getAllJob();
	    return job;
	}
	
	public static void main(String[] args){
		TestJob test = new TestJob();
		List<Job> jobs = test.getAllJob();
		for(int i=0;i<jobs.size();i++) {
		    Job job = jobs.get(i);
		    System.out.println(job.getJobCompany());
		}
	}
}
