package com.myspring.service;

import java.util.List;

import com.myspring.bean.Job;

public interface JobService {
	/**
	 * ��ȡ���е�job���� 
	 * @return
	 */
	int getCountJobs();
	
	/**
	 * ��ȡ����job��Ϣ
	 * @Title: getJobs
	 * @Description: TODO(������Ҫ�����������Ծ��Ϊ����)
	 * @author: Administrator
	 * @since: (��ʼʹ�õİ汾)
	 * @return
	 */
	List<Job> getJobs();

}
