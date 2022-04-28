package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import scala.sys.process.processInternal;

@Component
@Scope(value = "prototype")
public class Employee {
	private int eid;
	private String ename;
	private String tech;
	@Autowired
	@Qualifier("s1")
	private Source source;
	
	
	public Employee() {
		super();
		System.out.println("object created");
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	public void show()
	{
		System.out.println("in show");
		source.compile();
	}

}
