package com.myspring.dao;

import java.util.List;

import com.myspring.bean.Job;

public interface JobDAO {

	/**
	 * ��ȡjob������
	 * @return
	 */
	public int getJob();
	
	/**
	 * ��ȡ���е�job����Ϣ
	 * @Title: getAllJob
	 * @Description: TODO(������Ҫ�����������Ծ��Ϊ����)
	 * @author: Administrator
	 * @since: (��ʼʹ�õİ汾)
	 * @return
	 */
	public List<Job> getAllJob();
}
