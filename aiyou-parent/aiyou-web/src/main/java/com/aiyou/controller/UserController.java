package com.aiyou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiyou.domain.Result;
import com.aiyou.pojo.TbUser;
import com.aiyou.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Reference
	private UserService userService;

	@RequestMapping("/regist")
	public Result regist(TbUser user){
		try {
			int insert = userService.insert(user);
			System.out.println(insert);
			return new Result(true, "注册成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "注册失败");
		}
	}
}
