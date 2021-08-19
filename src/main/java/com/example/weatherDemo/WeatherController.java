package com.example.weatherDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
	@Autowired
	private WeatherService service;

	public WeatherController() {
		super();
	}

	@RequestMapping("/weather")
	private WeatherReport getWeather(String city) {
		return service.getWeatherFromApi(city);
	}
}
