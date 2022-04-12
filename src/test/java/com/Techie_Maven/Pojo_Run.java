package com.Techie_Maven;

public class Pojo_Run extends Pojo_Class {
	public static void main(String[] args) {
	
	
	Pojo_Class p=new Pojo_Class();
	p.setAge(16);
	p.setName("Divya");
	p.setPhno(123456l);
	
	int i = p.getAge();
	System.out.println(i);
	
	System.out.println(p.getName());
	System.out.println(p.getPhno());
	
	

}}
