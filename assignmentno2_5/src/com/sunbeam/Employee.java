package com.sunbeam;
import java.util.*;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class Employee
{
	private int id;
	private double salary;
	private String name;

	public Employee() {
		
	}

	public Employee(int id, double salary, String name) {
		
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]\n";
	}

}
