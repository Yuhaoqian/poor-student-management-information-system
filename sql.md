### 建立数据库

PSMIS (abbr: Poor Student Managment Information System)

``` sql
create database PSMIS;
```

### 建立user表

u_power 权限 (0为系统管理员，1是管理员)

u_question 密保问题

u_answer 密保答案

```sql
use PSMIS;
create table user(
  u_id int not null primary key,
  u_name varchar(30) not null,
  u_password varchar(20) not null,
  u_power int not null
)charset=utf8;
```


