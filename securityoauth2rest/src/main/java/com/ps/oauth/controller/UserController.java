package com.ps.oauth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.oauth.dao.domain.VUserRoleMapper;
import com.ps.oauth.dao.model.VUserRole;

@RestController
public class UserController {
	@Autowired	
	private VUserRoleMapper vuserRoleMapper;
	@PreAuthorize("hasRole('admin')")
	@GetMapping("/users")
	public List<VUserRole> getAllUserInfo(){
		return this.vuserRoleMapper.selectAll();
	}
}
