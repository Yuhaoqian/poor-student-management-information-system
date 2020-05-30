### 建立数据库

PSMIS (abbr: Poor Student Managment Information System)

``` sql
create database PSMIS;
```

### 建立user表

u_power 权限 (0为系统管理员，1是管理员)

```sql
use PSMIS;
create table user(
  u_id varchar(20) not null primary key,
  u_name varchar(30) not null,
  u_password varchar(20) not null,
  u_power int not null
)charset=utf8;

INSERT INTO `user` VALUES ('172219605102','邵倩','123456',0),('172219605201','江芳','123456',0),('172219605220','钱聿豪','123456',0);
```


