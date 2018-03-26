package com.myspring.dao;

import com.myspring.bean.Job;

public interface JobDAO {

	/**
	 * 获取job的数量
	 * @return
	 */
	public int getJob();
	
	/**
	 * 获取所有的job表信息
	 * @Title: getAllJob
	 * @Description: TODO(方法简要描述，必须以句号为结束)
	 * @author: Administrator
	 * @since: (开始使用的版本)
	 * @return
	 */
	public Job getAllJob();
}
