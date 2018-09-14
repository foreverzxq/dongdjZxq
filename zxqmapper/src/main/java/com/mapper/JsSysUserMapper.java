package com.mapper;

import com.pojo.JsSysUser;
import com.pojo.JsSysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JsSysUserMapper {
    int countByExample(JsSysUserExample example);

    int deleteByExample(JsSysUserExample example);

    int deleteByPrimaryKey(String userCode);

    int insert(JsSysUser record);

    int insertSelective(JsSysUser record);

    List<JsSysUser> selectByExample(JsSysUserExample example);

    JsSysUser selectByPrimaryKey(String userCode);

    int updateByExampleSelective(@Param("record") JsSysUser record, @Param("example") JsSysUserExample example);

    int updateByExample(@Param("record") JsSysUser record, @Param("example") JsSysUserExample example);

    int updateByPrimaryKeySelective(JsSysUser record);

    int updateByPrimaryKey(JsSysUser record);
}