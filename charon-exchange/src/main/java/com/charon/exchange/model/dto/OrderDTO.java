package com.charon.exchange.model.dto;

import com.charon.exchange.enums.OrderTransactionTypeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author by sl
 * @date 2020/10/23 10:28
 */
@Data
public class OrderDTO {

    @ApiModelProperty("交易对ID")
    private Integer pairId;

    @ApiModelProperty("买入币ID")
    private Integer coinId;

    @ApiModelProperty("兑换币ID")
    private Integer unitCoinId;

    @ApiModelProperty("买入价")
    private BigDecimal price;

    @ApiModelProperty("买入数量")
    private BigDecimal amount;

    @ApiModelProperty("订单方向（true买入false卖出）")
    private Boolean direction;

    @ApiModelProperty("订单类型")
    private OrderTransactionTypeEnum orderType;





}
