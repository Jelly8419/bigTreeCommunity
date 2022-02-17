package com.green.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.green.vo.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Setter(onMethod_=@Autowired)
	ReplyMapper replyMapper;
	
	
	//@Test
	public void countTest() {
		replyMapper.getCountByBno(121);
	}
	@Test
	public void getList() {
		replyMapper.getListWithPaging(new Criteria(1,20), 202);
	}
	
	
}
