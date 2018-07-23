package com.ps.oauth.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ps.oauth.dao.domain.VUserRoleMapper;
import com.ps.oauth.dao.model.VUserRole;

@Component
public class VUserRoleDao {
	@Autowired
	private VUserRoleMapper vUserRoleMapper;
	public List<VUserRole> getAllUserRole(){
		return this.vUserRoleMapper.selectAll();
	}
	public List<VUserRole> getUserRoleByUserName(String username){
		return this.vUserRoleMapper.selectByUserName(username);
	}
}
