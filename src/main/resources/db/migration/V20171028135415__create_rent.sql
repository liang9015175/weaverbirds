CREATE TABLE `rent` (
  `id`          INT(11) NOT NULL AUTO_INCREMENT
  COMMENT '主键ID',
  `user_name`   VARCHAR(20)      DEFAULT NULL
  COMMENT '租借用户',
  `depart`      INT(10)          DEFAULT NULL
  COMMENT '部门',
  `item_id`     INT(10)          DEFAULT NULL
  COMMENT '租用商品',
  `count`       INT(11)          DEFAULT NULL
  COMMENT '租借数量',
  `out_or_in`   INT(10)          DEFAULT NULL
  COMMENT '借入还是借出 0：借入 1：借出',
  `rent_status` INT(10)          DEFAULT NULL
  COMMENT '租借状态 0：租借取消 1：租借成功',
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
  COMMENT = '租借表';