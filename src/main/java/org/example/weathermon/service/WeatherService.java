package org.example.weathermon.service;

import org.example.weathermon.model.WeatherApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${openmetro.api.url}")
    private String apiUrl;

    public WeatherApi getWeather() {
        RestTemplate restTemplate = new RestTemplate();
        WeatherApi response = restTemplate.getForObject(apiUrl, WeatherApi.class);
        return response;
    }
}
