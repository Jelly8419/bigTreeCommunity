package com.green.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.green.vo.ReportVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class ReportMapperTests {
	@Setter(onMethod_=@Autowired)
	ReportMapper reportMapper;
	
	@Test
	public void registTest() {
		ReportVO vo= new ReportVO();
		vo.setBno(93);
		vo.setReason("불건전한 컨텐츠");
		vo.setReporter("테스터2");
		reportMapper.delete(vo);
	}
	
}
