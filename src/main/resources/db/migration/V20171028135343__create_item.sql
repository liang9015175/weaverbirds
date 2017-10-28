CREATE TABLE `item` (
  `id`          INT(10) NOT NULL AUTO_INCREMENT
  COMMENT '主键ID',
  `item_name`   VARCHAR(20)      DEFAULT NULL
  COMMENT '商品名称',
  `stock_count` INT(10)          DEFAULT NULL
  COMMENT '当前库存',
  `cate_id`     INT(10)          DEFAULT NULL
  COMMENT '商品分类',
  `status`      INT(10)          DEFAULT '1'
  COMMENT '状态 1:正常 0:删除',
  `create_at`   DATETIME         DEFAULT NULL
  COMMENT '创建时间',
  `create_by`   VARCHAR(20)      DEFAULT NULL
  COMMENT '创建人',
  `update_at`   DATETIME         DEFAULT NULL
  COMMENT '修改时间',
  `update_by`   VARCHAR(20)      DEFAULT NULL
  COMMENT '修改人',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '商品表';