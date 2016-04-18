CREATE TABLE IF NOT EXISTS `fruit_machine`.`game` (
  `no` VARCHAR(50) NOT NULL COMMENT '标识',
  `name` VARCHAR(256) NULL,
  `sign_coin` INT NULL DEFAULT 0 COMMENT '签到送金币数目',
  `is_valid` TINYINT(1) NULL DEFAULT 0 COMMENT '是否启用',
  `create_time` DATETIME NULL,
  PRIMARY KEY (`no`),
  UNIQUE INDEX `no_UNIQUE` (`no` ASC))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `fruit_machine`.`game_item_config` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `game_no` VARCHAR(50) NULL,
  `no` INT NULL COMMENT '鱼标识',
  `name` VARCHAR(256) NULL COMMENT '简称',
  `icon` VARCHAR(256) NULL,
  `rate` INT NULL COMMENT '倍率',
  `is_show` TINYINT(1) NULL DEFAULT 1,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `fruit_machine`.`game_map_config` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `game_no` VARCHAR(50) NULL,
  `no` INT NULL,
  `icon` VARCHAR(256) NULL,
  `rate` INT NULL COMMENT '倍率',
  `type` INT NULL COMMENT '类型，对应game_item_config中的no',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `fruit_machine`.`game_record` (
  `id` CHAR(32) NOT NULL,
  `user_id` INT NULL,
  `bet_rate` INT NULL COMMENT '押注倍率',
  `bet_content` VARCHAR(100) NULL COMMENT '押注内容',
  `bet_coin_total` INT NULL DEFAULT 0 COMMENT '下注金币总额',
  `method` VARCHAR(50) NULL,
  `result` VARCHAR(100) NULL,
  `gain_coin_total` INT NULL DEFAULT 0 COMMENT '赚取金币总额',
  `is_prize` TINYINT(1) NULL DEFAULT 0 COMMENT '是否领奖',
  `create_time` DATETIME NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB
COMMENT = '押注记录';