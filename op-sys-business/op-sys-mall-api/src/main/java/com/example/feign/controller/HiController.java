package com.example.feign.controller;

import com.example.feign.service.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 *
 * @author: nangua
 * project:eurekaserver
 * packageName:com.example.feign.controller
 * date:   2018-05-26 09:51
 */
@RestController
public class HiController {

    @Autowired
    ScheduleServiceHi scheduleServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        //你穿过的衣服，隔夜还有温度
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
