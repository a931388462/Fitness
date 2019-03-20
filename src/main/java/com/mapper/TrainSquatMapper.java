package com.mapper;

import com.po.TrainSquat;
import com.po.TrainSquatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainSquatMapper {
    long countByExample(TrainSquatExample example);

    int deleteByExample(TrainSquatExample example);

    int insert(TrainSquat record);

    int insertSelective(TrainSquat record);

    List<TrainSquat> selectByExample(TrainSquatExample example);

    int updateByExampleSelective(@Param("record") TrainSquat record, @Param("example") TrainSquatExample example);

    int updateByExample(@Param("record") TrainSquat record, @Param("example") TrainSquatExample example);
}