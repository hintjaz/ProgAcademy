package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите значение радиуса и нажмите Enter:");
		double radius = sc.nextDouble();
		double c = 2 * Math.PI * radius;
		System.out.println("ƒлина окружности: " + c );
		sc.close();

	}

}

