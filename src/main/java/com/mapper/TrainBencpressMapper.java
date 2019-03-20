package com.mapper;

import com.po.TrainBencpress;
import com.po.TrainBencpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainBencpressMapper {
    long countByExample(TrainBencpressExample example);

    int deleteByExample(TrainBencpressExample example);

    int insert(TrainBencpress record);

    int insertSelective(TrainBencpress record);

    List<TrainBencpress> selectByExample(TrainBencpressExample example);

    int updateByExampleSelective(@Param("record") TrainBencpress record, @Param("example") TrainBencpressExample example);

    int updateByExample(@Param("record") TrainBencpress record, @Param("example") TrainBencpressExample example);
}