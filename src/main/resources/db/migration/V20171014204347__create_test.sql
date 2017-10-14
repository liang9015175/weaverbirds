CREATE TABLE test (
  id        INT(11) NOT NULL AUTO_INCREMENT
  COMMENT '主键ID',
  create_at DATETIME         DEFAULT current_timestamp,
  PRIMARY KEY (id)
)
  ENGINE = InnDB
  COMMENT '测试表'