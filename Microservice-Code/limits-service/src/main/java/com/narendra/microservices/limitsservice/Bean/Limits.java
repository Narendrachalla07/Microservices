package com.narendra.microservices.limitsservice.Bean;


public class Limits {
	
	private int minimum;
	private int maximum;
	
	public Limits() {
		super();
	}

	public Limits(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getminimum() {
		return minimum;
	}

	public void setminimum(int minimum) {
		this.minimum = minimum;
	}

	public int getmaximum() {
		return maximum;
	}

	public void setmaximum(int maximum) {
		this.maximum = maximum;
	}
	
	

}
