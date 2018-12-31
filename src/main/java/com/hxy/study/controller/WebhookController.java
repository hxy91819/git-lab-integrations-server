package com.hxy.study.controller;

import com.hxy.study.controller.dto.Demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/common")
public class WebhookController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/pushEvent")
    public String pustEvent(@RequestBody String postString){
        logger.info("post string:{}",postString);
        return "success";
    }
}
