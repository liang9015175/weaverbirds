# 职工鸟资源管理系统
@(资源管理)[职工鸟|springboot|java|前端]
**职工鸟**是一款在线管理办公用品和会议室申请的内部管理系统，其主要都功能分为两大块：
- **办公用品认领** ：用户可以在线申请认领办公用品，不用的时候可以归还，申请认领之后，系统会进行审核，审核通过，扣库存。
- **会议室申请**：用户可以在线申请会议室，一旦会议室被申请，其他相关人员就可以看到，该会议室被占用都时间，时间区间失效之后，会议室更新为可用状态
- **物品认领统计**：管理员可以按照部门维度，查询近期各个部门的物品认领情况
- **字典管理**：针对部门字典，分类字典，物品字典，管理员可以维护

-----------------
## 技术选型
> 服务端技术采用JAVA+SpringBoot
> 持久化技术：Mybatis+MySql
> 数据库脚本：FlyWay
> 前端：HTML+JQuery+BootStrap3.0

-----------------
# 相关配置
### 数据库
``` yaml
server:
  port: 8080
  address: 0.0.0.0
  context-path: /weaver
spring:
  datasource:
    driver-class-name: com.mysql.jdbc.Driver
    url: jdbc:mysql://127.0.0.1:3306/liuyanan?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull
    username: root
    password: sl123456
  jackson:
    date-format: yyyy-MM-dd HH:mm:ss
    time-zone: GMT+8
mybatis:
  type-aliases-package: com.liuyanan.domain
  mapper-locations: com/liuyanan/mapper/*.xml
  config-location: classpath:/mybatis-config.xml
debug: true
```
---------------------
## 启动类
``` java
@SpringBootApplication
@MapperScan("com.liuyanan.dao")
public class WeaverbirdsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeaverbirdsApplication.class, args);
    }
}
```
--------------

## 日期解析
```java
@org.springframework.context.annotation.Configuration
public class Configuration {
    private static final Logger LOGGER = LoggerFactory.getLogger(Configuration.class);
    DateFormatter dateFormatter = new DateFormatter("yyyy-MM-dd HH:mm:ss");

    @Bean
    public Converter<String, Date> converter() {
        return new Converter<String, Date>() {
            Date date = null;

            @Override
            public Date convert(String source) {
                try {
                    date = dateFormatter.parse(source, Locale.CHINA);
                } catch (ParseException e) {
                    LOGGER.error("解析日期类型参数发生异常", e);
                }
                return date;
            }
        };
    }
}
```
------------------------

## 样本图
**首页**
![首页](https://github.com/liang9015175/weaverbirds/blob/master/snapshots/%E9%A6%96%E9%A1%B5.png)
**物品认领**
![物品列表](https://github.com/liang9015175/weaverbirds/blob/master/snapshots/%E7%89%A9%E5%93%81%E8%AE%A4%E9%A2%86.png)
![物品申请](https://github.com/liang9015175/weaverbirds/blob/master/snapshots/%E7%89%A9%E5%93%81%E5%88%9B%E5%BB%BA.png)

![物品申请审核](https://github.com/liang9015175/weaverbirds/blob/master/snapshots/%E7%89%A9%E5%93%81%E5%88%97%E8%A1%A8.png)
**会议室申请**
![会议室列表](https://github.com/liang9015175/weaverbirds/blob/master/snapshots/%E4%BC%9A%E8%AE%AE%E5%AE%A4%E5%88%97%E8%A1%A8.png)
![会议室申请](https://github.com/liang9015175/weaverbirds/blob/master/snapshots/%E4%BC%9A%E8%AE%AE%E5%AE%A4%E7%94%B3%E8%AF%B7.png)
![会议室创建](https://github.com/liang9015175/weaverbirds/blob/master/snapshots/%E4%BC%9A%E8%AE%AE%E5%AE%A4%E5%88%9B%E5%BB%BA.png)
**认领审核**
![认领审核](https://github.com/liang9015175/weaverbirds/blob/master/snapshots/%E8%AE%A4%E9%A2%86%E5%AE%A1%E6%A0%B8.png)
**统计**
![物品领用统计](https://github.com/liang9015175/weaverbirds/blob/master/snapshots/%E7%89%A9%E5%93%81%E9%A2%86%E7%94%A8%E7%BB%9F%E8%AE%A1.png)


## 后续
- 要做的：这仅仅是个demo，还要进行bug修复和需求再次确认，UI也需要修改
- 如果有机会这个东西能做大，希望把自己都所学也融入进去

## 反馈和建议
- 微信：[wxsongliang]()
- 邮箱：[807858227@qq.com]()

