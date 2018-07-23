package com.ps.oauth.dao.domain;

import com.ps.oauth.dao.model.VUserRole;
import java.util.List;

public interface VUserRoleMapper {
    int insert(VUserRole record);

    List<VUserRole> selectAll();
    
    List<VUserRole> selectByUserName(String username);
}