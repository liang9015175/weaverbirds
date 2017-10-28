CREATE TABLE `category` (
  `id`            INT(11) NOT NULL AUTO_INCREMENT,
  `category_name` VARCHAR(50)      DEFAULT NULL,
  `status`        INT(10)          DEFAULT '1'
  COMMENT '状态 1:正常 0:删除',
  `create_at`     DATETIME         DEFAULT NULL,
  `create_by`     VARCHAR(50)      DEFAULT NULL,
  `update_at`     DATETIME         DEFAULT NULL,
  `update_by`     VARCHAR(50)      DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '分类表';