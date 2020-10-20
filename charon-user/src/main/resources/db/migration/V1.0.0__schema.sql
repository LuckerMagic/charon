DROP TABLE IF EXISTS `user_base`;
CREATE TABLE `user_base`
(
    `user_id`     bigint(20)   NOT NULL COMMENT '用户ID',
    `telephone`   char(11)     NULL COMMENT '用户手机号',
    `email`       varchar(32)  NULL COMMENT '用户邮箱',
    `password`    varchar(20)  NOT NULL COMMENT '用户密码',
    `active_flag` tinyint(1)   NOT NULL DEFAULT 0 COMMENT '是否激活（1是0否）',
    `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
    PRIMARY KEY (`user_id`)
) COMMENT = '用户基础信息';