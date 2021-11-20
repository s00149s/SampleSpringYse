package sample.spring.yse;

import java.util.List;
import java.util.Map;

// 기능 서비스 인터페이스 메소드 시그니쳐 생성

public interface BookService {

	String create(Map<String, Object> map);

	Map<String, Object> detail(Map<String, Object> map);
	
	boolean edit(Map<String, Object> map);

	boolean remove(Map<String, Object> map);

	List<Map<String, Object>> list(Map<String, Object> map);

}
