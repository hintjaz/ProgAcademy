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
		System.out.println("������� a:");
		a = sc.nextInt();
		System.out.println("������� b:");
		b = sc.nextInt();
		System.out.println("������� c:");
		c = sc.nextInt();
		System.out.println("������� z:");
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
		System.out.println("������������ �����: " + max);

	}
}

