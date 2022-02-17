package com.green.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.green.vo.BoardVO;
import com.green.vo.Criteria;
import com.green.vo.QnaVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class QnaMapperTests {

	@Setter(onMethod_=@Autowired)
	QnaMapper qnamapper;
	
	@Setter(onMethod_=@Autowired)
	QnaReplyMapper qnaReplyMapper;
	
	//@Test
	public void registTest() {
		for(int i=0; i<10;i++) {
			QnaVO vo = new QnaVO();
			vo.setTitle("qna제목입니다"+(i+1));
			vo.setContent("내용입니다"+(i+1));
			vo.setWriter("작성자test"+(i+1));
			qnamapper.registQna(vo);
		}
	}
	@Test
	public void getReply() {
		qnaReplyMapper.getListWithPaging(new Criteria(),3);
	}
}
