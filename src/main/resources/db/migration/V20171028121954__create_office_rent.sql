CREATE TABLE `office_rent` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `office_id` INT(11) NOT NULL COMMENT '租借的办公室ID',
  `applicant` VARCHAR(25) NULL DEFAULT NULL COMMENT '申请人',
  `content` VARCHAR(255) NULL DEFAULT NULL COMMENT '申请内容',
  `depart_id` INT(11) NULL DEFAULT NULL COMMENT '申请部门',
  `start_time` DATETIME NULL DEFAULT NULL COMMENT '开始时间',
  `end_time` DATETIME NULL DEFAULT NULL COMMENT '结束时间',
  `create_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP COMMENT '申请时间',
  `status` INT(11) NULL DEFAULT '1' COMMENT '申请状态,1:审批通过，0：不通过',
  PRIMARY KEY (`id`)
)
  COMMENT='办公室申请表'
  COLLATE='utf8_general_ci'
  ENGINE=InnoDB
;
