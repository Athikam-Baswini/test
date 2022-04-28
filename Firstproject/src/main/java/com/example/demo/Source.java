package com.example.demo;

import org.springframework.stereotype.Component;

@Component("s1")
public class Source {
	private int id;
	private String brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Source [id=" + id + ", brand=" + brand + "]";
	}
    public void compile()
    {
    	System.out.println("compiling...");
    }
}
