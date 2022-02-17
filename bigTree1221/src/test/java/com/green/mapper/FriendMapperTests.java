package com.green.mapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.green.vo.FriendVO;
import com.green.vo.MemberVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class FriendMapperTests {

	@Setter(onMethod_=@Autowired)
	FriendMapper friendMapper;
	
	
	//@Test
	public void registTest() {
		FriendVO vo = new FriendVO();
		vo.setReceiver_id("jo8419");
		vo.setSend_id("tester11");
		friendMapper.regist(vo);
	}
	
	//@Test
	public void getTest() {
		FriendVO vo = new FriendVO();
		vo.setReceiver_id("jo8419");
		vo.setSend_id("tester11");
		friendMapper.getFriendVO(vo);
	}
	
	//@Test
	public void getMember() {
		friendMapper.getMemberList("jo8419");
	}
	
	//@Test
	public void deleteTest() {
		FriendVO vo = new FriendVO();
		vo.setReceiver_id("jo8419");
		vo.setSend_id("tester11");
	 friendMapper.delete(friendMapper.getFriendVO(vo));
	}
	
	//@Test
	public void updateTest() {
		FriendVO vo = new FriendVO();
		vo.setFno(2);
		vo.setReceiver_id("jo8419");
		vo.setSend_id("tester11");
		vo.setCheck_frd(1);
		friendMapper.update(vo);
		
	}
	//@Test
	public void getMemberListTest() {
		friendMapper.getMemberList("테스터");
		log.info("true Or False?: " +friendMapper.getMemberList("테스터").size() );
	}
	
	//@Test
	public void getReceivedTest() {
		FriendVO vo = new FriendVO();
		vo.setReceiver_id("jo8419");
		
		friendMapper.getFriendRecieved(vo);
	}
	@Test
	public void getMyFriend() {
	 
	  
	}
}
