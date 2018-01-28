package com.jay.learnspringboot.mapper;

import com.jay.learnspringboot.model.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * created by zhoujie on 2018/01/28
 */
public interface CityMapper {

    @Select("SELECT * FROM city WHERE city_id = #{cityId}")
    @Results({
            @Result(id = true, property = "cityId", column = "city_id"),
            @Result(property = "countryId", column = "country_id"),
            @Result(property = "lastUpdate", column = "last_update")
    })
//    @ResultMap("CityMap")
    City selectCityById(@Param("cityId") int cityId);
}
