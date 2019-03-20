package com.mapper;

import com.po.WeightUnit;
import com.po.WeightUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeightUnitMapper {
    long countByExample(WeightUnitExample example);

    int deleteByExample(WeightUnitExample example);

    int deleteByPrimaryKey(Integer unitid);

    int insert(WeightUnit record);

    int insertSelective(WeightUnit record);

    List<WeightUnit> selectByExample(WeightUnitExample example);

    WeightUnit selectByPrimaryKey(Integer unitid);

    int updateByExampleSelective(@Param("record") WeightUnit record, @Param("example") WeightUnitExample example);

    int updateByExample(@Param("record") WeightUnit record, @Param("example") WeightUnitExample example);

    int updateByPrimaryKeySelective(WeightUnit record);

    int updateByPrimaryKey(WeightUnit record);
}