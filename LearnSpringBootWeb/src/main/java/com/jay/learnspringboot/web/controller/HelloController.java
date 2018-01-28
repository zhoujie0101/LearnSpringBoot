package com.jay.learnspringboot.web.controller;

import com.jay.learnspringboot.model.City;
import com.jay.learnspringboot.service.CityService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by zhoujie on 2018/01/28
 */
@RestController
public class HelloController {

    private static final Logger logger = LogManager.getLogger(HelloController.class);

    @Autowired
    private CityService cityService;

    @GetMapping("/{id}")
    public City hello(@PathVariable Integer id) {
        logger.info("id: " + id);
        logger.error("id: " + id);
        City city = cityService.getCity(id);
        return city;
    }
}
