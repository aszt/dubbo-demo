package com.aiyou.mapper;

import com.aiyou.pojo.TbUser;

public interface TbUserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}