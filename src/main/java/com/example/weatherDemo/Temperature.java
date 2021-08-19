package com.example.weatherDemo;

public class Temperature {
	private double temp;
	private double temp_min;
	private double temp_max;

	public Temperature() {
		super();
	}

	public double getTemp() {
		return temp;
	}

	//converting kelvin to celsius
	public void setTemp(double temp) {
		this.temp = temp - 273.16;
	}

	public double getTemp_min() {
		return temp_min;
	}

	//converting kelvin to celsius
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min - 273.16;
	}

	public double getTemp_max() {
		return temp_max;
	}

	//converting kelvin to celsius
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max - 273.16;
	}
}
