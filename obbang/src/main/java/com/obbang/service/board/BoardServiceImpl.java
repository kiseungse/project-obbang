package com.obbang.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obbang.mapper.board.BoardMapper;
import com.obbang.model.board.BoardDTO;
import com.obbang.model.board.Criteria;



@Service
public class BoardServiceImpl implements BoardService{
	@Autowired 
	private BoardMapper mapper;

	@Override
	public void enroll(BoardDTO board) {

		mapper.enroll(board);

	}
	//게시판 리스트
	@Override
	public List<BoardDTO> getList() {

		return mapper.getList();
	}
	  /* 게시판 조회 */
    @Override
    public BoardDTO getPage(int board_bno) {
         
        return mapper.getPage(board_bno);
    }
    /* 게시판 수정 */
    @Override
    public int modify(BoardDTO board) {
        
        return mapper.modify(board);
    }
    /* 게시판 삭제 */
    @Override
    public int delete(int board_bno) {
        
        return mapper.delete(board_bno);
    }    
 
    /* 게시판 목록(페이징 적용) */
    @Override
    public List<BoardDTO> getListPaging(Criteria cri) {
        
        return mapper.getListPaging(cri);
    } 
    
    /* 게시물 총 갯수 */
    @Override
    public int getTotal(Criteria cri) {
        
        return mapper.getTotal(cri);
    }

 
    
}
