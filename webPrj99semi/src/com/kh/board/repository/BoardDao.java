package com.kh.board.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kh.board.vo.BoardVo;
import com.kh.category.vo.CategoryVo;
import com.kh.common.PageVo;

import static com.kh.common.JDBCTemplate.*;

public class BoardDao {

	/*
	 * 게시글 총 갯수 조회
	 */
	public int getCount(Connection conn) {
		//Connection 준비
		
		//SQL 준비
		String sql = "SELECT COUNT(NO) AS COUNT FROM BOARD WHERE STATUS = 'N' AND TYPE = 1";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		
		try {
			//SQL 을 객체에 담기 및 ㅓSQL 완성
			pstmt = conn.prepareStatement(sql);
			
			//SQL 실행 및 결과 저장
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt("COUNT");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		
		
		
		//실행 결과 리턴
		return count;
		
	}

	/*
	 * 게시글 목록 조회
	 * (현재 페이지에 해당하는)
	 */
	public List<BoardVo> selectList(Connection conn, PageVo pageVo) {
		//conn 준비
		//SQL 준비
		String sql = "SELECT * FROM ( SELECT ROWNUM RNUM, T.* FROM ( SELECT B.NO , B.TITLE , B.CONTENT , B.CNT , B.ENROLL_DATE , M.ID AS WRITER , C.CATEGORY_NAME FROM BOARD B JOIN MEMBER M ON B.WRITER = M.NO JOIN CATEGORY C USING(CATEGORY_NO) WHERE B.TYPE = 1 AND B.STATUS = 'N' ORDER BY B.NO DESC ) T ) WHERE RNUM BETWEEN ? AND ?";

		PreparedStatement pstmt = null;
		List<BoardVo> list = new ArrayList<BoardVo>();
		ResultSet rs = null;
		
		try {
			//SQL 객체에 담기 및 완성
			pstmt = conn.prepareStatement(sql);
			
			int start = (pageVo.getCurrentPage()-1)*pageVo.getBoardLimit()+1;
			int end = start+pageVo.getBoardLimit()-1;
			
			
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			//SQL 실행 및 결과저장
			rs = pstmt.executeQuery();
			
			//rs -> java
			while(rs.next()) {
				
				String no = rs.getString("NO");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				String cnt = rs.getString("CNT");
				String enrollDate = rs.getString("ENROLL_DATE");
				String writer = rs.getString("WRITER");
				String categoryName = rs.getString("CATEGORY_NAME");
				
				BoardVo vo = new BoardVo();
				vo.setNo(no);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setCnt(cnt);
				vo.setEnrollDate(enrollDate);
				vo.setWriter(writer);
				vo.setCategoryNo(categoryName);
				
				list.add(vo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		
		//결과 리턴
		return list;
		
	}

	/*
	 * 카테고리 정보 조회
	 */
	public List<CategoryVo> selectCategoryList(Connection conn) {
		
		//conn 준비
		//SQL 준비
		String sql = "SELECT CATEGORY_NO , CATEGORY_NAME FROM CATEGORY";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<CategoryVo> list = new ArrayList<CategoryVo>();
		
		try {
			//SQL 을 객체에 담기 및 완성
			pstmt = conn.prepareStatement(sql);
			
			//SQL 실행 및 결과 저장
			rs = pstmt.executeQuery();
			
			//rs -> java
			while(rs.next()) {
				CategoryVo vo = new CategoryVo(
						rs.getString("CATEGORY_NO")
						,rs.getString("CATEGORY_NAME")
						);
				
				list.add(new CategoryVo(
						rs.getString("CATEGORY_NO")
						,rs.getString("CATEGORY_NAME")
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		//결과 리턴
		return list;
	}
	

}