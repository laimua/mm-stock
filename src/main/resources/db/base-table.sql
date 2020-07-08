CREATE TABLE `base_user` (
  `user_id` 				varchar(16) 	NOT NULL 		COMMENT '用户id',
  `user_name_login` 		varchar(255) 	NOT NULL 		COMMENT '登录名称',
  `user_password` 			varchar(255) 	NOT NULL 		COMMENT '账号密码',
  `user_name_real` 			varchar(255) 	DEFAULT NULL 	COMMENT '真实姓名',
  `user_age` 				int(3) 			DEFAULT NULL 	COMMENT '年龄',
  `user_phone` 				varchar(16) 	DEFAULT NULL 	COMMENT '电话',
  `user_email` 				varchar(128) 	DEFAULT NULL 	COMMENT '邮箱',
  `user_ctime` 				datetime 		DEFAULT NULL 	COMMENT '创建时间',
  `user_mtime` 				datetime 		DEFAULT NULL 	COMMENT '修改时间',
  `user_status` 			int(11) 		DEFAULT NULL 	COMMENT '账号状态',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';