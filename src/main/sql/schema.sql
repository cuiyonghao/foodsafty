-- 数据库初始化脚本

-- 创建数据库
CREATE DATANASE foodsafty;

-- 使用数据库
use foodsafty;

-- 创建用户数据库
CREATE TABLE user(`user_id` varchar(120) NOT NULL COMMENT '用户登录id',
`user_name` varchar(120) NOT NULL COMMENT '用户真实姓名',
`user_email` varchar(120) NOT NULL COMMENT '用户邮箱',
`user_phone` varchar(11) NOT NULL COMMENT '用户手机号',
`user_password` char(32) NOT NULL COMMENT '用户密码',
PRIMARY KEY (user_id),
key fs_user_name(user_name),
key fs_user_email(user_email),
key fs_user_phone(user_phone)
)ENGINE=InnoDB CHARSET=utf8 COMMENT='用户信息';

--插入一条用户数据
insert into
  user(user_id,user_name,user_email,user_phone,user_password)
VALUES
  ('thy','汤虹妖','12536589@qq.com','15136525896','123456');

--创建管理员数据库
CREATE TABLE manager(`manager_id` varchar(120) NOT NULL COMMENT '管理员ID',
`manager_password` varchar(120) NOT NULL COMMENT '管理员密码'
)ENGINE=InnoDB CHARSET=utf8 CoMMENT='管理员信息';

-- 插入管理员信息
insert into
  manager(manager_id,manager_password)
VALUES
  ('admin','987654321');