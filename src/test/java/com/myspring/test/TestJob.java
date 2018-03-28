package com.myspring.test;

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
	public Job getAllJob() {
	    SqlSession session = MyBatisUtil.getSession();
	    JobDAO jobDAO = session.getMapper(JobDAO.class);
	    Job job = jobDAO.getAllJob();
	    return job;
	}
	
	public static void main(String[] args){
		TestJob test = new TestJob();
		test.getJob();
	}
}
