package com.sunbeam;

import java.util.Arrays;

public class Test 
{
	public static void selectionSort(Employee[] e) {
		int count = 0;

		for (int i = 0; i < e.length - 1; i++) {
			for (int j = i + 1; j < e.length; j++) {
				count++;
				if (e[i].getSalary() > e[j].getSalary()) {
					Employee eTemp = e[i];
					e[i] = e[j];
					e[j] = eTemp;
				}
			}
		}
	}

	public static void main(String[] args) {

		Employee[] arrEmployee = new Employee[5];

		arrEmployee[0] = new Employee(1001, 2000.00, "surabhi");
		arrEmployee[1] = new Employee(1011, 4000.00, "anita");
		arrEmployee[2] = new Employee(1003, 3500.00, "rutuja");
		arrEmployee[3] = new Employee(1020, 6500.00, "bhumika");
		arrEmployee[4] = new Employee(1009, 1000.00, "chitrali");

		selectionSort(arrEmployee);

		System.out.println("SORTED = " + Arrays.toString(arrEmployee));
	}

}
