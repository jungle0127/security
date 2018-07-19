package com.ps.oauth.dao.domain;

import com.ps.oauth.dao.model.VUserRole;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface VUserRoleMapper {
    @Insert({
        "insert into v_user_role (id, username, ",
        "password, role_name)",
        "values (#{id,jdbcType=BIGINT}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{roleName,jdbcType=VARCHAR})"
    })
    int insert(VUserRole record);

    int insertSelective(VUserRole record);
    
    @Select(value = { " select id,username,password,role_from from v_user_role" })
    List<VUserRole> seleAll();
}