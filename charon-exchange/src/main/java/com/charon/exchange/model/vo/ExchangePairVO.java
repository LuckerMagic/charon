package com.charon.exchange.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author by sl
 * @date 2020/10/19 16:53
 */
@Data
public class ExchangePairVO {

    @ApiModelProperty("交易对ID")
    private Integer pairId;

    @ApiModelProperty("币ID")
    private Integer coinId;

    @ApiModelProperty("币名称")
    private String coinName;

    @ApiModelProperty("汇率")
    private BigDecimal exchangeRate;

    @ApiModelProperty("开启时间")
    private Date startTime;

    @ApiModelProperty("结束时间")
    private Date endTime;

    @ApiModelProperty("单位币列表")
    private List<ExchangePairVO> exchangePairList;

}
