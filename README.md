# PetBack - 宠栖汀”宠物领养与宠物服务平台后端

## 项目概述
PetBack是一个基于Spring Boot的宠物管理系统后端服务，提供宠物健康记录、领养服务、论坛交流等功能，旨在为宠物主人和相关机构提供便捷的数字化管理工具。

## 功能特性
- 🐾 宠物健康记录管理
- 🏠 宠物领养服务
- 💬 宠物论坛交流系统
- 🔔 通知提醒功能
- 🔐 用户认证与授权
- 📊 数据统计与分析

## 技术栈
- **核心框架**: Spring Boot 3.2.8
- **ORM框架**: MyBatis-Plus 3.5.5
- **数据库**: MySQL
- **API文档**: Knife4j (基于OpenAPI 3)
- **认证授权**: JWT
- **工具类**: Hutool 5.8.25
- **构建工具**: Maven
- **开发语言**: Java 17

## 环境要求
- JDK 17+ 
- MySQL 8.0+ 
- Maven 3.6+ 
- IDE (IntelliJ IDEA推荐)

## 快速开始

### 1. 克隆项目
```bash
git clone https://github.com/yourusername/petBack.git
cd petBack
```

### 2. 配置数据库
在`application.yml`中配置数据库连接信息：
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/pet_back?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
    username: root
    password: yourpassword
    driver-class-name: com.mysql.cj.jdbc.Driver
```

### 3. 构建与运行
```bash
# 编译打包
mvn clean package

# 运行应用
java -jar target/petBack-0.0.1-SNAPSHOT.jar
```
或通过IDE直接运行`PetBackApplication.java`

### 4. 访问API文档
启动后访问: [http://localhost:8080/doc.html](http://localhost:8080/doc.html)

## 项目结构
```
src/main/java/com/example/petback/
├── controller/       # 控制器层
├── service/          # 服务层
├── mapper/           # 数据访问层
├── entity/           # 实体类
│   └── forum/        # 论坛相关实体
├── config/           # 配置类
├── util/             # 工具类
└── PetBackApplication.java  # 应用入口
```

## 版权信息
本项目为私有项目，未经授权不得用于商业用途。

