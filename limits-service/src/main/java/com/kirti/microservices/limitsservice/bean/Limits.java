package com.kirti.microservices.limitsservice.bean;

public class Limits {

	private String environment;
	private int minimum;
	private int maximum;
	
	public Limits(String environment, int minimum, int maximum) {
		super();
		this.environment = environment;
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public Limits() {
		super();
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
}
