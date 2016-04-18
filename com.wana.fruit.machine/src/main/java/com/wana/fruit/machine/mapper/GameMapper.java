package com.wana.fruit.machine.mapper;

import com.wana.fruit.machine.model.entity.Game;
import com.wana.fruit.machine.model.entity.GameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameMapper {
    int countByExample(GameExample example);

    int deleteByExample(GameExample example);

    int deleteByPrimaryKey(String no);

    int insert(Game record);

    int insertSelective(Game record);

    List<Game> selectByExample(GameExample example);

    Game selectByPrimaryKey(String no);

    int updateByExampleSelective(@Param("record") Game record, @Param("example") GameExample example);

    int updateByExample(@Param("record") Game record, @Param("example") GameExample example);

    int updateByPrimaryKeySelective(Game record);

    int updateByPrimaryKey(Game record);
}