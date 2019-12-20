package kr.pe.myblog.contect.dao;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

//DAOImpl 추가 : DAO 인터페이스 구현 후
//@repository 어노테이션 필요
//mappers폴더 하부에 contectinfoMapper.xml 생성이 필요함!!!

@Repository
public class ContectinfoDAOImpl implements ContectinfoDAO {
	
	// SqlSession 추가 후 @Inject 어노테이션 추가 필요
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace 
	= "kr.pe.myblog.mappers.contect.contectinfoMapper";

	@Override
	public int insertContect( Map<String, String> parameters) {
		// TODO Auto-generated method stub
		System.out.println( "DAOImpl Line 27 : " + parameters.get("subject") );
		return sqlSession.insert(Namespace+".insertContect", parameters);
	}

	@Override
	public int updateContect(Map<String, String> parameters) {
		// TODO Auto-generated method stub
		return sqlSession.update(Namespace+".updateContect", parameters);
	}

	@Override
	public int deleteContect(Map<String, String> parameters) {
		// TODO Auto-generated method stub
		return sqlSession.delete(Namespace+".deleteContect", parameters);
	}

}
