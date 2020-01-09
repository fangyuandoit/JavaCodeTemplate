package com.fy.javacodetemplate.result;

import lombok.Data;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/9 10:41
 * @Description:
 */
@Data
public class CodeMsg {

    private int code;
    private String msg;


    public static CodeMsg SUCCESS =new CodeMsg(0,"success");



    //通用异常
    public static CodeMsg SERVER_ERROR =new CodeMsg(500100,"服务端异常");

    //登录模块异常  502xxx

    //xx模块异常   503xxx




    public CodeMsg(int code, String msg) {
        this.code=code;
        this.msg =msg;
    }
}
