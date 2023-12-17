package com.example.demo;
public class Person 
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+name+"   "+address+"	  "+age+"]";
	}
	private String name;
	private String address;
	private long age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
}
