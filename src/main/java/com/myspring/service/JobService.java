package com.myspring.service;

import java.util.List;

import com.myspring.bean.Job;

public interface JobService {
	/**
	 * 获取所有的job数量 
	 * @return
	 */
	int getCountJobs();
	
	/**
	 * 获取所有job信息
	 * @Title: getJobs
	 * @Description: TODO(方法简要描述，必须以句号为结束)
	 * @author: Administrator
	 * @since: (开始使用的版本)
	 * @return
	 */
	List<Job> getJobs();

}
