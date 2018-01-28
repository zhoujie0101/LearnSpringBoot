package com.jay.learnspringboot.service.impl;

import com.jay.learnspringboot.mapper.CityMapper;
import com.jay.learnspringboot.model.City;
import com.jay.learnspringboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by zhoujie on 2018/01/28
 */
@Service("CityService")
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public City getCity(int id) {
        return cityMapper.selectCityById(id);
    }
}
