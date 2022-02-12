package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("¬ведите длину превой стороны треугольника:");
double a = sc.nextDouble();


System.out.println("¬ведите длину второй стороны треугольника:");
double b = sc.nextDouble();


System.out.println("¬ведите длину третьей стороны треугольника:");
double c = sc.nextDouble();

double per = (a + b + c) / 2;
double square = Math.sqrt(per * (per - a) * (per - b) * (per  - c));

System.out.println("ѕлощадь этого треугольника " + square + " метров квадратных");

	}

}

