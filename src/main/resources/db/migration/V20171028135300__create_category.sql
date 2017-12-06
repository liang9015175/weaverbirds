CREATE TABLE `category` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `category_name` VARCHAR(50) NULL DEFAULT NULL,
  `status` INT(10) NULL DEFAULT '1' COMMENT '状态 1:正常 0:删除',
  `create_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `create_by` VARCHAR(50) NULL DEFAULT NULL,
  `update_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_by` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  COMMENT='分类表'
  COLLATE='utf8_general_ci'
  ENGINE=InnoDB
;