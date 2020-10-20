package com.charon.common.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author by sl
 * @date 2020/10/19 16:31
 */
@Data
public class ResultVO<T> implements Serializable {

    @ApiModelProperty("状态码")
    private Integer code;

    @ApiModelProperty("提示信息")
    private String msg;

    @ApiModelProperty("数据")
    private T data;

    public ResultVO() {
        this.code = 200;
        this.msg = "成功";
    }

    public  ResultVO(T data) {
        this.code = 200;
        this.msg = "成功";
        this.data = data;
    }
}
