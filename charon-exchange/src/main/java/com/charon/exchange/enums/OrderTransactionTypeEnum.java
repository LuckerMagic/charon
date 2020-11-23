package com.charon.exchange.enums;

import io.swagger.annotations.ApiModelProperty;

/**
 * 订单类型
 * @author by sl
 * @date 2020/10/23 10:33
 */
public enum OrderTransactionTypeEnum {
    /**
     * 限价
     */
    @ApiModelProperty("限价")
    FIXED_PRICE,

    /**
     * 市价
     */
    @ApiModelProperty("市价")
    MARKET_PRICE;

    /**
     * 计划委托类型
     */
    enum PlanEntrustTypeEnum {
        /**
         * 限价
         */
        @ApiModelProperty("限价")
        FIXED_PRICE,

        /**
         * 市价
         */
        @ApiModelProperty("市价")
        MARKET_PRICE;

    }


}
