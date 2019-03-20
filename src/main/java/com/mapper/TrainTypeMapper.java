package com.mapper;

import com.po.TrainType;
import com.po.TrainTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainTypeMapper {
    long countByExample(TrainTypeExample example);

    int deleteByExample(TrainTypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(TrainType record);

    int insertSelective(TrainType record);

    List<TrainType> selectByExample(TrainTypeExample example);

    TrainType selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") TrainType record, @Param("example") TrainTypeExample example);

    int updateByExample(@Param("record") TrainType record, @Param("example") TrainTypeExample example);

    int updateByPrimaryKeySelective(TrainType record);

    int updateByPrimaryKey(TrainType record);
}