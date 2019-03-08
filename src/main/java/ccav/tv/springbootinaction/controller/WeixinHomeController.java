package ccav.tv.springbootinaction.controller;

import ccav.tv.springbootinaction.model.vo.ResponseWrapper;

import ccav.tv.springbootinaction.utils.ResponseUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
@RestController
@RequestMapping("/home")
public class WeixinHomeController {
    @RequestMapping("index")
    public ResponseWrapper index(){
        return ResponseUtil.responseOk(Arrays.asList("tom","cat","lily","jerry"));
    }
}
