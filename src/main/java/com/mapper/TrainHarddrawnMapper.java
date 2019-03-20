package com.mapper;

import com.po.TrainHarddrawn;
import com.po.TrainHarddrawnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainHarddrawnMapper {
    long countByExample(TrainHarddrawnExample example);

    int deleteByExample(TrainHarddrawnExample example);

    int insert(TrainHarddrawn record);

    int insertSelective(TrainHarddrawn record);

    List<TrainHarddrawn> selectByExample(TrainHarddrawnExample example);

    int updateByExampleSelective(@Param("record") TrainHarddrawn record, @Param("example") TrainHarddrawnExample example);

    int updateByExample(@Param("record") TrainHarddrawn record, @Param("example") TrainHarddrawnExample example);
}