# javase-demo

学完javase知识之后一直想着找个小项目来练手，今天更新一个demo

这是一个桌面应用-记账本

前端：Swing 

数据库：MySql

数据库连接工具：JDBC

前后端通信：监听器ActionListener

开发过程主要有以下几步：

数据库表设计，主要包括三张表config category record

前端开发

实体层、持久层开发

业务层开发

测试

项目包结构如下：

dao：存放数据库操作的实现类

entity：实体类，数据库表中数据项的实现

gui：前端页面

service：每个功能点的逻辑实现

startup：启动界面

util：封装之后的类文件
