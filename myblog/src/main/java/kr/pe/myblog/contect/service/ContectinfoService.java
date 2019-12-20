package kr.pe.myblog.contect.service;

import java.util.Map;

//Service 추가 : Service 인터페이스를 생성한 후 root-context.xml 의
//<context:component-scan base-package="kr.pe.myblog.contect.service"></context:component-scan> 
//추가 필요

public interface ContectinfoService {

	// 문의 등록
	public int insertContect(Map<String,String> parameters);
	
	// 문의 수정
	public int updateContect(Map<String,String> parameters);
	
	// 문의 삭제
	public int deleteContect(Map<String,String> parameters);
}
