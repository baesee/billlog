package com.billlog.miribojob.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.billlog.miribojob.dao.UserDAO;
import com.billlog.miribojob.user.model.UserVO;
import com.billlog.miribojob.user.service.IUserService;

@Service("UserService")
public class UserServiceImpl implements IUserService{
	
	@Resource(name = "UserDAO")
	private UserDAO dao;
	
	@Override
	public List<UserVO> selectUserList() throws Exception {
		return dao.selectUserList();
	}
}
