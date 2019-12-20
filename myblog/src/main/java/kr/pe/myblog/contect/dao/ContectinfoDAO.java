package kr.pe.myblog.contect.dao;

import java.util.Map;

//DAO 추가 : DAO 인터페이스를 생성한 후 root-context.xml 의
//<context:component-scan base-package="kr.pe.myblog.contect.dao"></context:component-scan> 
//추가 필요

public interface ContectinfoDAO {

	public int insertContect(Map<String, String> parameters);

	public int updateContect(Map<String, String> parameters);

	public int deleteContect(Map<String, String> parameters);
}
