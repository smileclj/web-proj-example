package com.wana.fruit.machine.service;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wana.fruit.machine.common.enums.ItemTypeEnum;
import com.wana.fruit.machine.model.entity.Game;
import com.wana.fruit.machine.model.entity.GameItemConfig;
import com.wana.fruit.machine.model.entity.GameMapConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class FruitServiceInit {

	@Resource
	private FruitService fruitService;

	@Test
	public void test() {

	}

	@Test
	public void init() {
		String gameNo = _addGame();
		_addGameItemConfigs(gameNo);
		_addGameMapConfigs(gameNo);
	}

	// ================================================//

	private String _addGame() {
		Game game = new Game();
		game.setNo("fish_v1");
		game.setIsValid(true);
		game.setName("捕鱼机");
		game.setSignCoin(0);
		game.setCreateTime(new Date());
		fruitService.addGame(game);
		return game.getNo();
	}

	private GameItemConfig _getGameItem(String gameNo, int no, String name, boolean isShow, int rate) {
		GameItemConfig item = new GameItemConfig();
		item.setGameNo("fish_v1");
		item.setIsShow(isShow);
		item.setName(name);
		item.setNo(no);
		item.setRate(rate);
		return item;
	}

	private GameMapConfig _getGameMap(String gameNo, int no, int rate, int type) {
		GameMapConfig map = new GameMapConfig();
		map.setGameNo(gameNo);
		map.setNo(no);
		map.setRate(rate);
		map.setType(type);
		return map;
	}

	private void _addGameItemConfigs(String gameNo) {
		fruitService.addGameItemConfig(_getGameItem(gameNo, 1, "金鲨", true, 120));
		fruitService.addGameItemConfig(_getGameItem(gameNo, 2, "银鲨", true, 40));
		fruitService.addGameItemConfig(_getGameItem(gameNo, 3, "翅膀鱼", true, 30));
		fruitService.addGameItemConfig(_getGameItem(gameNo, 4, "乌龟", true, 20));
		fruitService.addGameItemConfig(_getGameItem(gameNo, 5, "灯笼鱼", true, 20));
		fruitService.addGameItemConfig(_getGameItem(gameNo, 6, "龙虾", true, 15));
		fruitService.addGameItemConfig(_getGameItem(gameNo, 7, "尼莫", true, 10));
		fruitService.addGameItemConfig(_getGameItem(gameNo, 8, "小黄鱼", true, 5));
		fruitService.addGameItemConfig(_getGameItem(gameNo, 9, "左侧luck", false, 0));
		fruitService.addGameItemConfig(_getGameItem(gameNo, 10, "右侧luck", false, 0));
	}

	private void _addGameMapConfigs(String gameNo) {
		fruitService.addGameMapConfig(_getGameMap(gameNo, 1, 0, ItemTypeEnum.NIMO.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 2, 0, ItemTypeEnum.TORTOISE.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 3, 50, ItemTypeEnum.GOLD_SHARK.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 4, 120, ItemTypeEnum.GOLD_SHARK.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 5, 0, ItemTypeEnum.WING_FISH.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 6, 2, ItemTypeEnum.WING_FISH.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 7, 0, ItemTypeEnum.LOBSTER.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 8, 0, ItemTypeEnum.TORTOISE.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 9, 2, ItemTypeEnum.TORTOISE.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 10, 0, ItemTypeEnum.RIGHT_LUCK.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 11, 0, ItemTypeEnum.YELLOW_FISH.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 12, 2, ItemTypeEnum.NIMO.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 13, 0, ItemTypeEnum.NIMO.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 14, 0, ItemTypeEnum.LANTERN_FISH.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 15, 2, ItemTypeEnum.SLIVER_SHARK.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 16, 0, ItemTypeEnum.SLIVER_SHARK.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 17, 0, ItemTypeEnum.YELLOW_FISH.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 18, 2, ItemTypeEnum.LOBSTER.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 19, 0, ItemTypeEnum.LOBSTER.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 20, 0, ItemTypeEnum.WING_FISH.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 21, 2, ItemTypeEnum.WING_FISH.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 22, 0, ItemTypeEnum.LEFT_LUCK.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 23, 0, ItemTypeEnum.YELLOW_FISH.getKey()));
		fruitService.addGameMapConfig(_getGameMap(gameNo, 24, 2, ItemTypeEnum.LANTERN_FISH.getKey()));
	}
}
