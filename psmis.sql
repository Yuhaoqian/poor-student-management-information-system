create database PSMIS;
use PSMIS;
drop table stu;
create table user(
  u_id varchar(20) not null primary key,
  u_name varchar(30) not null,
  u_password varchar(20) not null,
  u_power int not null
)charset=utf8;
INSERT INTO `user` VALUES ('172219605102','邵倩','123456',0),('172219605201','江芳','123456',0),('172219605220','钱聿豪','123456',0);
use PSMIS;
drop table stu;
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
insert into stu values
  ('172219605102','邵倩','汉','','','','','',0,'','',''),
  ('172219605201','江芳','汉','','','','','',0,'','',''),
  ('172219605220','钱聿豪','汉','','','','','',0,'','','');
drop table fund;
create table fund(
    f_id int not null primary key auto_increment,
    f_name varchar(30) not null,
    f_abs text not null,
    f_amount double not null,
    f_time bigint(20) not null,
    f_img varchar(50) not null
)charset=utf8;
drop table work;
create table work(
    w_id int not null primary key auto_increment,
    w_name varchar(30),
    w_abs text not null,
    w_time bigint(20) not null,
    w_position varchar(255) not null,
    w_money double not null,
    w_img varchar(50) not null
)charset=utf8;
drop table f_apply;
create table f_apply(
    fa_id int not null primary key auto_increment,
    sid varchar(20) not null,
    fid int not null,
    fa_time bigint(20) not null,
    fa_flag int not null,
    fa_reviewer varchar(30) not null
)charset=utf8;
drop table w_apply;
create table w_apply(
    wa_id int not null primary key auto_increment,
    sid varchar(20) not null,
    fid int not null,
    wa_time bigint(20) not null,
    wa_flag int not null,
    wa_reviewer varchar(30) not null
)charset=utf8;