package com.aiyou.service;

import com.aiyou.pojo.TbUser;

public interface UserService {
	public int deleteByPrimaryKey(Integer uid);

	public int insert(TbUser record);

	public int insertSelective(TbUser record);

	public TbUser selectByPrimaryKey(Integer uid);

	public int updateByPrimaryKeySelective(TbUser record);

	public int updateByPrimaryKey(TbUser record);

}
