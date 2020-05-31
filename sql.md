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

### 建立stu表

```sql
use PSMIS;
create table stu(
  s_id varchar(20) not null primary key,
  s_name varchar(30) not null,
  s_nation varchar(10) not null,
  s_sex varchar(10) not null,
  s_birth varchar(50) not null,
  s_major varchar(50) not null,
  s_phone varchar(20) not null,
  s_address varchar(255) not null,
  s_income double not null,
  s_res text not null,
  s_info text not null,
  s_other text not null
)charset=utf8;
```



### 资助项目表（fund）

```sql
create table fund(
    f_id int not null primary key auto_increment,
    f_name varchar(30) not null,
    f_abs text not null,
    f_amount double not null,
    f_time bigint(20) not null,
    f_img varchar(50) not null
)charset=utf8;
```

### 勤工助学项目表（work）

```sql
create table work(
    w_id int not null primary key auto_increment,
    w_name varchar(30),
    w_abs text not null,
    w_time bigint(20) not null,
    w_position varchar(255) not null,
    w_money double not null,
    w_img varchar(50) not null
)charset=utf8;
```

### 资助项目申请表（f_apply）

```sql
create table f_apply(
    fa_id int not null primary key auto_increment,
    sid int not null,
    fid int not null,
    fa_time bigint(20) not null,
    fa_flag int not null,
    fa_reviwer varchar(30) not null
)charset=utf8;
```

### 助学项目申请表（w_apply）

```sql
create table w_apply(
    wa_id int not null primary key auto_increment,
    sid int not null,
    fid int not null,
    wa_time bigint(20) not null,
    wa_flag int not null,
    wa_reviwer varchar(30) not null
)charset=utf8;
```