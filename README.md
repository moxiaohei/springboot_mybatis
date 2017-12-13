# springboot_mybatis
SpringBoot整合Mybatis示例

1.其中项目的结构图为：
```
 src/
 +- main/
     +- java/
        +- com.mxf.
             +- bean
             +- controller
             +- dao
             +- service
                +-impl
             |- App.java
     +- resources/
             +- mapper
             |- application.properties
```

2.数据库的准备如下：

```
CREATE DATABASE first;
```

```
CREATE TABLE `user_info` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `passWord` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
```

3.改数据库配置
    打开 application.properties 文件， 修改相应的数据源配置，比如数据源地址、账号、密码等。

4.运行App.java文件中的main方法启动SpringBoot

5.打开浏览器进行访问

