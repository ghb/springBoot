package com.suneee.controller;

import com.suneee.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/3/16.
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = "/say",method = RequestMethod.GET)
    @GetMapping(value = "say")
    public  String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return "id:"+id;
//        return girlProperties.getCupSize();
    }
}
