CREATE TABLE `exchange_pair`
(
    `pair_id`       int         NOT NULL COMMENT '主键',
    `coin_id`       int         NOT NULL COMMENT '兑换币种ID',
    `unit_coin_id`  int         NOT NULL COMMENT '单位币种ID',
    `exchange_rate` decimal(20, 8) NOT NULL COMMENT '汇率',
    `start_time`    time(0)        NOT NULL DEFAULT '00:00:00' COMMENT '开启时间',
    `end_time`      time(0)        NOT NULL DEFAULT '23:59:59' COMMENT '结束时间',
    `create_by`     int         NOT NULL COMMENT '创建用户',
    `update_by`     int         NOT NULL COMMENT '更新用户',
    `create_time`   timestamp(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`   timestamp(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
    PRIMARY KEY (`pair_id`, `coin_id`)
) COMMENT = '币币交易对';