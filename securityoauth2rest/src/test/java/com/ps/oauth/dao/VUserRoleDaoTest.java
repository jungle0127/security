package com.ps.oauth.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ps.oauth.dao.model.VUserRole;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VUserRoleDaoTest {
	@Autowired
	private VUserRoleDao vUserRoleDao;
	@Test
	public void testGetAll() {
		List<VUserRole> userRoleList = this.vUserRoleDao.getAllUserRole();
		Assert.assertTrue(userRoleList.size() > 0);
	}
	@Test
	public void testGetUserRoleByUsername() {
		List<VUserRole> userRoleList = this.vUserRoleDao.getUserRoleByUserName("ps");
		Assert.assertTrue(userRoleList.size() > 0);
	}
}
