package com.billlog.miribojob.interview.service;

import java.util.List;

import com.billlog.miribojob.interview.dao.InterviewDAO;
import com.billlog.miribojob.interview.model.InterviewVO;
import com.billlog.miribojob.user.model.UserVO;


public interface IInterviewService{
	public List<InterviewVO> selectInterviewList() throws Exception;
	
	public void insertInterview(InterviewVO interviewVO) throws Exception;
}
