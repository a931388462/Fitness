package com.mapper;

import com.po.TrainDate;
import com.po.TrainDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainDateMapper {
    long countByExample(TrainDateExample example);

    int deleteByExample(TrainDateExample example);

    int insert(TrainDate record);

    int insertSelective(TrainDate record);

    List<TrainDate> selectByExample(TrainDateExample example);

    int updateByExampleSelective(@Param("record") TrainDate record, @Param("example") TrainDateExample example);

    int updateByExample(@Param("record") TrainDate record, @Param("example") TrainDateExample example);
}