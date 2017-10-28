CREATE TABLE office (
  id        INT(11) NOT NULL AUTO_INCREMENT
  COMMENT '主键ID',
  name      VARCHAR(50)      DEFAULT NULL
  COMMENT '办公室名称',
  create_at DATETIME         DEFAULT current_timestamp
  COMMENT '创建时间',
  create_by VARCHAR(25)      DEFAULT NULL
  COMMENT '创建人',
  update_at DATETIME         DEFAULT current_timestamp
  COMMENT '更新时间',
  update_by VARCHAR(25)      DEFAULT NULL
  COMMENT '更新人',
  PRIMARY KEY (id)

)
  COMMENT '办公室表'