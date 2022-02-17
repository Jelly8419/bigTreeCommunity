package com.green.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.green.vo.MemberVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTests {
	@Setter(onMethod_=@Autowired)
	MemberMapper memberMapper;
	
	//@Test
	public void insertDummies() {
		for(int i=0; i<100;i++) {
			MemberVO vo = new MemberVO();
			vo.setUser_name("테스터"+(i+1));
			vo.setUser_pwd("1234");
			vo.setUser_id("tester"+(i+1));
			vo.setUser_address("없음");
			vo.setUser_phone("010-1234-"+(i+1));
			vo.setUser_email("tester@aaa.cc"+(i+1));
			vo.setUser_birth("00년 00월 00일");
			vo.setUser_kakao("");
			memberMapper.signup(vo);
		}
	}
	@Test
	public void getImage() {
		memberMapper.getImage("jo8419");
	}
	
	
}
