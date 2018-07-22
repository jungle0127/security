package com.ps.oauth.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ps.oauth.dao.VUserRoleDao;
import com.ps.oauth.dao.model.VUserRole;

public class SecurityUserDetailService implements UserDetailsService {
	@Autowired
	private VUserRoleDao vUserRoleDao;
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		List<VUserRole> userRolePojoList = this.vUserRoleDao.getUserRoleByUserName(userName);
		if(userRolePojoList == null || userRolePojoList.size() == 0) {
			throw new UsernameNotFoundException("Can't find the user with username:" + userName);
		}
		Collection<SimpleGrantedAuthority> authorityCollection = new HashSet<>();
		for(VUserRole pojo: userRolePojoList) {
			authorityCollection.add(new SimpleGrantedAuthority(pojo.getRoleName()));
		}
		return new User(userName,userRolePojoList.get(0).getPassword(), authorityCollection);
	}
	
	
}
