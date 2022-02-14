package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class ThirdTaskLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите четырехзначное число: ");
		int x = sc.nextInt();
		int a = x / 1000;
		int b = x % 1000 / 100;
		int c = x % 100 / 10;
		int d = x % 10 / 1;
		if (a + b == c + d)
			System.out.println("Это счастливый билет!");
		else {
			System.out.println("Это НЕ счастливый билет");
		}
		sc.close();
	}
}