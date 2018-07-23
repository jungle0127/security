package com.ps.oauth.dao.domain;

import com.ps.oauth.dao.model.UserRole;
import java.util.List;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    UserRole selectByPrimaryKey(Long id);

    List<UserRole> selectAll();

    int updateByPrimaryKey(UserRole record);
}