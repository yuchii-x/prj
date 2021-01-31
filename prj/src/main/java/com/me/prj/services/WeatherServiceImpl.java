package com.me.prj.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.prj.respositories.WeatherRepository;
/**
 * weather实现类
 * @author yuchi
 *
 */
@Service
public class WeatherServiceImpl implements WeatherService {
    private WeatherRepository weatherRepository;

    @Autowired
    public void setProductRepository(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }


    public Map getWeatherById(Integer id) {
        return weatherRepository.find(id);
    }
}
