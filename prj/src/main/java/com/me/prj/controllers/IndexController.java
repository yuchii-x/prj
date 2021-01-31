package com.me.prj.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.me.prj.response.ResponseData;
import com.me.prj.services.WeatherService;
/**
 * controller
 * @author yuchi
 *
 */

@Controller
public class IndexController {

    private WeatherService weatherService;

    @Autowired
    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    
    @RequestMapping("/")
    String index(){
        return "index";
    }
    
    @RequestMapping("find/{id}")
    @ResponseBody ResponseData show(@PathVariable Integer id){
        Map data = weatherService.getWeatherById(id);
        ResponseData res = new ResponseData();
        res.setData(data);
        return res;
    }
}
