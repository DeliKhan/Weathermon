package org.example.weathermon.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherApi {
    private Hourly hourly;
    public Hourly getHourly() {
        return hourly;
    }
    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }
    public static class Hourly {
        @JsonProperty("temperature_2m_max")
        private List<Double> tempMax;
        public List<Double> getTempMax() {
            return tempMax;
        }
        public void setTempMax(List<Double> tempMax) {
            this.tempMax = tempMax;
        }

        @JsonProperty("weather_code")
        private List<Integer> weatherCode;
        public List<Integer> getWeatherCode(){
            return weatherCode;
        }
        public void setWeatherCode(List<Integer> weatherCode){
            this.weatherCode = weatherCode;
        }
        private List<Integer> precipitation;
        public List<Integer> getPrecipitation() {
            return precipitation;
        }
        @JsonProperty("apparent_temperature")
        private List<Double> feelsLike;
        public List<Double> getFeelsLike() {
            return feelsLike;
        }
        public void setFeelsLike(List<Double> feelsLike){
            this.feelsLike = feelsLike;
        }

    }
    private Daily daily;

    public Daily getDaily(){
        return daily;
    }

    public void setDaily(Daily daily){
        this.daily = daily;
    }

    public static class Daily {
        @JsonProperty("temperature_2m_max")
        private List<Double> tempMax;
        public List<Double> getTempMax() {
            return tempMax;
        }
        public void setTempMax(List<Double> tempMax) {
            this.tempMax = tempMax;
        }

        @JsonProperty("weather_code")
        private List<Integer> weatherCode;
        public List<Integer> getWeatherCode(){
            return weatherCode;
        }
        public void setWeatherCode(List<Integer> weatherCode){
            this.weatherCode = weatherCode;
        }

        @JsonProperty("apparent_temperature_max")
        private List<Double> feelsLike;
        public List<Double> getFeelsLike() {
            return feelsLike;
        }
        public void setFeelsLike(List<Double> feelsLike){
            this.feelsLike = feelsLike;
        }

        @JsonProperty("precipitation_probability_max")
        private List<Integer> precipitationChance;
        public List<Integer> getPrecipitationChance() {
            return precipitationChance;
        }
        public void setPrecipitationChance(List<Integer> precipitationChance){
            this.precipitationChance = precipitationChance;
        }
    }
}