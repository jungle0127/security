package com.ps.oauth.dao.domain;

import com.ps.oauth.dao.model.VUserRole;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface VUserRoleMapper {
    @Insert({
        "insert into v_user_role (id, username, ",
        "password, role_name)",
        "values (#{id,jdbcType=BIGINT}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{roleName,jdbcType=VARCHAR})"
    })
    int insert(VUserRole record);

    int insertSelective(VUserRole record);
    
    @Select(value = { " select id,username,password,role_name from v_user_role order by id desc" })
    @Results({
    	@Result(column="id",property="id",jdbcType=JdbcType.BIGINT),
    	@Result(column="username",property="username",jdbcType=JdbcType.VARCHAR),
    	@Result(column="password", property="password",jdbcType=JdbcType.VARCHAR),
    	@Result(column="role_name", property="roleName",jdbcType=JdbcType.VARCHAR)
    })
    List<VUserRole> seleAll();
}