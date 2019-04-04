package com.mapper;

import com.po.TrainContent;
import com.po.TrainContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainContentMapper {
    long countByExample(TrainContentExample example);

    int deleteByExample(TrainContentExample example);

    int insert(TrainContent record);

    int insertSelective(TrainContent record);

    List<TrainContent> selectByExample(TrainContentExample example);

    int updateByExampleSelective(@Param("record") TrainContent record, @Param("example") TrainContentExample example);

    int updateByExample(@Param("record") TrainContent record, @Param("example") TrainContentExample example);
}