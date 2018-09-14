package com.mapper;

import com.pojo.LyUser;
import com.pojo.LyUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LyUserMapper {
    int countByExample(LyUserExample example);

    int deleteByExample(LyUserExample example);

    int deleteByPrimaryKey(String usersId);

    int insert(LyUser record);

    int insertSelective(LyUser record);

    List<LyUser> selectByExample(LyUserExample example);

    LyUser selectByPrimaryKey(String usersId);

    int updateByExampleSelective(@Param("record") LyUser record, @Param("example") LyUserExample example);

    int updateByExample(@Param("record") LyUser record, @Param("example") LyUserExample example);

    int updateByPrimaryKeySelective(LyUser record);

    int updateByPrimaryKey(LyUser record);
}