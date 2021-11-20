package sample.spring.yse;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	
	// 책 입력 기능 메소드
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	public int insert(Map<String, Object> map) {
		  return this.sqlSessionTemplate.insert("book.insert", map);
		}
	
	// 책 상세페이지 메소드
	public Map<String, Object> selectDetail(Map<String, Object> map){
		return this.sqlSessionTemplate.selectOne("book.select_detail", map);
	}
	
	// 책 수정 기능 메소드
	public int update(Map<String, Object> map) {
		return this.sqlSessionTemplate.update("book.update", map);
	}
	
	// 책 삭제 기능 메소드
	public int delete(Map<String, Object> map) {
		return this.sqlSessionTemplate.delete("book.delete", map);
	}
	
	// 책 목록 데이터베이스 접속 메소드
	public List<Map<String, Object>> selectList(Map<String, Object> map){
		return this.sqlSessionTemplate.selectList("book.select_list", map);
	}
}
