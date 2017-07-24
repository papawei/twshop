package com.tw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by tengw on 2017/5/22.
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("/getList")
    public String getList(){
        return "hello";
    }
}
