package com.fy.javacodetemplate.controller;

import com.fy.javacodetemplate.result.CodeMsg;
import com.fy.javacodetemplate.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/9 10:03
 * @Description:
 */
@RestController
@RequestMapping("TestController")
public class TestController {


    @RequestMapping("success")
    public Result<String> success(){
        return Result.success("hello kitty");
    }

    @RequestMapping("error")
    public Result<String> error(){
        return Result.error(CodeMsg.SERVER_ERROR);
    }



}
