package com.ps.oauth.dao.domain;

import com.ps.oauth.dao.model.Users;
import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    Users selectByPrimaryKey(Long id);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);
}