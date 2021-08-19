package com.example.weatherDemo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class WeatherReport {
	private long id;
	private String name;
	private Coordinates coord;
	private List<Weather> weather;
	private Temperature main;

	public WeatherReport() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coordinates getCoord() {
		return coord;
	}

	public void setCoord(Coordinates coord) {
		this.coord = coord;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public Temperature getMain() {
		return main;
	}

	public void setMain(Temperature main) {
		this.main = main;
	}
}