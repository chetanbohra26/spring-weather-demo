package com.example.weatherDemo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
	private static final String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";
	private static final String app_key = "f9347d993b8c14b0961bc98b1e0ee1ee";

	public WeatherReport getWeatherFromApi(String city) {
		RestTemplate template = new RestTemplate();
		return template.getForObject(String.format(apiUrl, city, app_key), WeatherReport.class);
	}
}
