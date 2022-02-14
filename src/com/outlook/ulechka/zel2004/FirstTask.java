package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int z;
		int max;
		System.out.println("Введите a:");
		a = sc.nextInt();
		System.out.println("Введите b:");
		b = sc.nextInt();
		System.out.println("Введите c:");
		c = sc.nextInt();
		System.out.println("Введите z:");
		z = sc.nextInt();

		max = a;
		if (b > a) {
			max = b;
		}
		if (c > a) {
			max = c;
		} 
		if (z > a) {
			max = z;
		} 
		System.out.println("Максимальное число: " + max);

	}
}

