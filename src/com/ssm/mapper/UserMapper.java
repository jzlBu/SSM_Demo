package com.ssm.mapper;

import java.util.List;

/**
 * 用户信息接口
 * @author Mr.Lin
 *
 */
public interface UserMapper {
	
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
