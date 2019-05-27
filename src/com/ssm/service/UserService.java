package com.ssm.service;

import java.util.List;

public interface UserService {
	
	/**
	 * 保存信息
	 * @return
	 */
	int save();
	
	/**
	 * 查询信息集合  
	 * 
	 * ,,
	 * @return
	 */
	List<Object> objects();
	
	/**
	 * 修改信息
	 * @return
	 */
	int edit();
	
	/**
	 * 删除信息
	 * @return
	 */
	int delete();

}
