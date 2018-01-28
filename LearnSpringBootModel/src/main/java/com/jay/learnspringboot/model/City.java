package com.jay.learnspringboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * created by zhoujie on 2018/01/28
 */
public class City implements Serializable {
    private static final long serialVersionUID = 9004479265930286200L;

    private Integer cityId;
    private String city;
    private Integer countryId;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date lastUpdate;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
