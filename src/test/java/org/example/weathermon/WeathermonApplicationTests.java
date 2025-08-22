package org.example.weathermon;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.example.weathermon.model.WeatherApi;
import org.example.weathermon.model.WeatherApi.Daily;
import org.example.weathermon.model.WeatherApi.Hourly;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class WeathermonApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testWeatherEndpoint() throws Exception {
        String json = mockMvc.perform(get("/weather").accept(MediaType.APPLICATION_JSON))
                                        .andExpect(status().isOk())
                                        .andReturn()
                                        .getResponse()
                                        .getContentAsString();
        
        WeatherApi model = objectMapper.readValue(json, WeatherApi.class);

        assertNotNull(model);

        Hourly hourly = model.getHourly();
        Daily daily = model.getDaily();

        assertNotNull(hourly);
        assertNotNull(daily);

        assertNotNull(hourly.getFeelsLike());
        assertFalse(hourly.getFeelsLike().isEmpty());
        assertNotNull(hourly.getPrecipitation());
        assertFalse(hourly.getPrecipitation().isEmpty());
        assertNotNull(hourly.getTempMax());
        assertFalse(hourly.getTempMax().isEmpty());
        assertNotNull(hourly.getWeatherCode());
        assertFalse(hourly.getWeatherCode().isEmpty());

        assertNotNull(daily.getFeelsLike());
        assertFalse(daily.getFeelsLike().isEmpty());
        assertNotNull(daily.getPrecipitationChance());
        assertFalse(daily.getPrecipitationChance().isEmpty());
        assertNotNull(daily.getTempMax());
        assertFalse(daily.getTempMax().isEmpty());
        assertNotNull(daily.getWeatherCode());
        assertFalse(daily.getWeatherCode().isEmpty());
    }

}
