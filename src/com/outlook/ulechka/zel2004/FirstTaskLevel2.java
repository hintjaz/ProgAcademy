package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class FirstTaskLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		System.out.println("Введите x:");
		x = sc.nextDouble();
		System.out.println("Введите y:");
		y = sc.nextDouble();
		if (x*x+y*y<16) {
			System.out.println("Точка находиться внутри круга");
		} else {
			System.out.println("Точка НЕ находиться внутри круга");
		}

		sc.close();
	}

}
