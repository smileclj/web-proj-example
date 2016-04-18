package com.wana.fruit.machine.mapper;

import com.wana.fruit.machine.model.entity.GameMapConfig;
import com.wana.fruit.machine.model.entity.GameMapConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameMapConfigMapper {
    int countByExample(GameMapConfigExample example);

    int deleteByExample(GameMapConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameMapConfig record);

    int insertSelective(GameMapConfig record);

    List<GameMapConfig> selectByExample(GameMapConfigExample example);

    GameMapConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameMapConfig record, @Param("example") GameMapConfigExample example);

    int updateByExample(@Param("record") GameMapConfig record, @Param("example") GameMapConfigExample example);

    int updateByPrimaryKeySelective(GameMapConfig record);

    int updateByPrimaryKey(GameMapConfig record);
}