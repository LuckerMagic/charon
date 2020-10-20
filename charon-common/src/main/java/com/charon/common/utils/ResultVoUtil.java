package com.charon.common.utils;

import com.charon.common.vo.ResultVO;

/**
 * @author by sl
 * @date 2020/10/19 16:37
 */
public class ResultVoUtil {

    /**
     * 请求成功无数据返回
     * @return ResultVO<T>
     */
    public static <T>ResultVO<T> success(){
        return new ResultVO<>();
    }

    /**
     * 请求成功并返回数据
     * @return ResultVO<T>
     */
    public static <T>ResultVO<T> successWithData(T data){
        return new ResultVO<>(data);
    }

}
