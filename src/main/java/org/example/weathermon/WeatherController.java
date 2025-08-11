package org.example.weathermon;

import org.example.weathermon.model.WeatherApi;
import org.example.weathermon.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/weather")
public class WeatherController {
        @Autowired
        private WeatherService weatherService;

        @GetMapping
        public WeatherApi getWeather() {
            return weatherService.getWeather();
        }
        
}
