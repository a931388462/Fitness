package com.mapper;

import com.po.FitnessUser;
import com.po.FitnessUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FitnessUserMapper {
    long countByExample(FitnessUserExample example);

    int deleteByExample(FitnessUserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(FitnessUser record);

    int insertSelective(FitnessUser record);

    List<FitnessUser> selectByExample(FitnessUserExample example);

    FitnessUser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") FitnessUser record, @Param("example") FitnessUserExample example);

    int updateByExample(@Param("record") FitnessUser record, @Param("example") FitnessUserExample example);

    int updateByPrimaryKeySelective(FitnessUser record);

    int updateByPrimaryKey(FitnessUser record);
}