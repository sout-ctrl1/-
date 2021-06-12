package com.javasampleapproach.jqueryajax.model;

public class Customer {
	 
	private String name;
	private Integer age;
	private Address address;
	
	public Customer(){}
	
	public Customer(String name, Integer age, Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public Integer getAge() {
		return age;
	}
 
	public void setAge(Integer age) {
		this.age = age;
	}
 
	public Address getAddress() {
		return address;
	}
 
	public void setAddress(Address address) {
		this.address = address;
	}
 
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
 
}