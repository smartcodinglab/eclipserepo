package kr.pe.myblog.contect.service;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.pe.myblog.contect.dao.ContectinfoDAO;
import kr.pe.myblog.team.dao.TeaminfoDAO;

//ServiceImpl 추가 : Service 인터페이스 구현 후
//@Service 어노테이션 추가 필요

@Service
public class ContectinfoServiceImpl implements ContectinfoService {
	
	// DAO 추가 후 @Inject 어노테이션 추가 필요
	@Inject
	private ContectinfoDAO dao;

	@Override
	public int insertContect(Map<String, String> parameters) {
		// TODO Auto-generated method stub
		System.out.println( "Line 14 : " + parameters.get("subject") );
		return dao.insertContect(parameters);
	}

	@Override
	public int updateContect(Map<String, String> parameters) {
		// TODO Auto-generated method stub
		return dao.updateContect(parameters);
	}

	@Override
	public int deleteContect(Map<String, String> parameters) {
		// TODO Auto-generated method stub
		return dao.deleteContect(parameters);
	}

}
