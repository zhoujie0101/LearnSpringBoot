package com.jay.learnspringboot.mapper;

import com.jay.learnspringboot.model.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * created by zhoujie on 2018/01/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityMapperTest {
    @Autowired
    private CityMapper cityMapper;

    @Test
    public void selectByCityIdTest() {
        City city = cityMapper.selectCityById(2);
        assertThat(city.getCity()).isEqualTo("Abha");
    }
}
