package com.aiyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.aiyou.mapper.TbUserMapper;
import com.aiyou.pojo.TbUser;
import com.aiyou.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

//dubbo中的注解
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper tbUserDao;
	
	@Override
	public int deleteByPrimaryKey(Integer uid) {
		return tbUserDao.deleteByPrimaryKey(uid);
	}

	@Override
	public int insert(TbUser record) {
		return tbUserDao.insert(record);
	}

	@Override
	public int insertSelective(TbUser record) {
		return tbUserDao.insertSelective(record);
	}

	@Override
	public TbUser selectByPrimaryKey(Integer uid) {
		return tbUserDao.selectByPrimaryKey(uid);
	}

	@Override
	public int updateByPrimaryKeySelective(TbUser record) {
		return tbUserDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TbUser record) {
		return tbUserDao.updateByPrimaryKey(record);
	}

}
