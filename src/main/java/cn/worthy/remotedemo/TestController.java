package cn.worthy.remotedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:yaowenxi
 * Date: 2018/4/20
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }

}
