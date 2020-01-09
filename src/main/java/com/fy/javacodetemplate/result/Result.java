package com.fy.javacodetemplate.result;

import lombok.Data;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/9 10:17
 * @Description:
 */
@Data
public class Result<T> {

    private int code;
    private String msg;
    private T data;

    private  Result() {
    }

    public Result(T data) {
        this.code=0;
        this.msg="success";
        this.data =data;

    }

    public Result(CodeMsg codeMsg) {
        if(codeMsg==null){
            return;
        }
           this.code = codeMsg.getCode();
           this.msg=codeMsg.getMsg();
    }

    /**
     * 成功时候调用
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data){
        return new Result<T>(data);
    }

    /**
     * s失败时调用
     * @param codeMsg
     * @param <T>
     * @return
     */
    public static <T> Result<T>  error(CodeMsg codeMsg){
        return new Result<T>(codeMsg);
    }

}
