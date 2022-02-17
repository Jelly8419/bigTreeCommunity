package com.green.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.green.vo.BoardVO;
import com.green.vo.Criteria;
import com.green.vo.PageDTO;


import lombok.Setter;
import lombok.extern.log4j.Log4j;
import oracle.net.aso.b;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Setter(onMethod_=@Autowired)
	BoardMapper boardMapper;
	
	
	
	//@Test
	public void regist1() {
		BoardVO vo = new BoardVO();
		vo.setTitle("test1123");
		vo.setContent("test133323");
		vo.setWriter("asd32");
		boardMapper.registBoard(vo);
	}
	
	//@Test
	public void deleteTest() {
		boardMapper.deleteBoard(67);
	}
	//@Test
	public void registTest() {
		for(int i=0; i<50;i++) {
			BoardVO vo = new BoardVO();
			vo.setTitle("제목..."+(i+1));
			vo.setContent("내용...."+(i+1));
			vo.setWriter("작성자....."+(i+1));
			boardMapper.registBoard(vo);
		}
	}
	//@Test
	public void getListTest() {
		boardMapper.getBoardList();
	}
	//@Test
	public void getBoardTest() {
		boardMapper.getBoard(3);
	}
	//@Test
	public void updateTest() {
		BoardVO vo = new BoardVO();
		vo.setBno(15);
		vo.setContent("수정된 내용");
		vo.setTitle("수정된 제목");
		boardMapper.updateBoard(vo);
	}
	
	
	
	//@Test
	public void ListwithPageTest() {
		Criteria cri = new Criteria(1,20);
		cri.setKeyword("수정");
		boardMapper.getBoardListWithPage(cri);
	}
   // @Test
	public void getCount() {
		boardMapper.getBoardListWithPage(new Criteria(1,20));
	}
	//@Test
	public void getBoardById() {
		Criteria  criteria=new Criteria();
		criteria.setKeyword("jo8419");
		criteria.setType("D");
		boardMapper.getBoardListWithPage(criteria);
	}
	@Test
	public void getBoardCount() {
		Criteria criteria = new Criteria();
		criteria.setKeyword("내용");
		criteria.setType("C");
		boardMapper.getTotalCount(criteria);
	}
	
}
