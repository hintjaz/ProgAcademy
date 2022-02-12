package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		int result;
		System.out.println("¬ведите п€тизначное число и нажмите Enter:");
		num = sc.nextInt();
		result = num / 10000;
		System.out.println(result);
		result = (num % 10000) / 1000;
		System.out.println(result);
		result = (num % 1000) / 100;
		System.out.println(result);
		result = (num % 100) / 10;
		System.out.println(result);
		result = (num % 10);
		System.out.println(result);
		sc.close();
	}
}


