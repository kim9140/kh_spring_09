package com.mycompany.myapp09.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp09.model.dao.MemberDAO;

@Service
public class MemberServicelmpl implements MemberService {
	@Autowired
	MemberDAO memberdao;

	@Override
	public int idCheck(String id) throws Exception {
		return memberdao.idCheck(id);
	}
}
