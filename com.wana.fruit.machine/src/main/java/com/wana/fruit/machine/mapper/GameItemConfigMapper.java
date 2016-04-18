package com.wana.fruit.machine.mapper;

import com.wana.fruit.machine.model.entity.GameItemConfig;
import com.wana.fruit.machine.model.entity.GameItemConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameItemConfigMapper {
    int countByExample(GameItemConfigExample example);

    int deleteByExample(GameItemConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameItemConfig record);

    int insertSelective(GameItemConfig record);

    List<GameItemConfig> selectByExample(GameItemConfigExample example);

    GameItemConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameItemConfig record, @Param("example") GameItemConfigExample example);

    int updateByExample(@Param("record") GameItemConfig record, @Param("example") GameItemConfigExample example);

    int updateByPrimaryKeySelective(GameItemConfig record);

    int updateByPrimaryKey(GameItemConfig record);
}