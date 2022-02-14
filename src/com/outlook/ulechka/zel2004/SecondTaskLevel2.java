package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class SecondTaskLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double xA = 0;
		double yA = 0;
		double xB = 4;
		double yB = 4;
		double xC = 6;
		double yC = 1;
		System.out.println("Введите x:");
		double x = sc.nextDouble();
		System.out.println("Введите y:");
		double y = sc.nextDouble();
		sc.close();
		double s1 = (xA - x)*(yB-yA)-(xB-xA)*(yA-y);
		double s2 = (xB - x)*(yC-yB)-(xC-xB)*(yB-y);
		double s3 = (xC - x)*(yA-yC)-(xA-xC)*(yC-y);
		
		
		if ((s1>=0 && s2>=0 && s3>=0) || (s1<=0 && s2<=0 && s3<=0)) {
			System.out.println("Точка находиться внутри треугольника");
		} else {
			System.out.println("Точка НЕ находиться внутри треугольника");
		}

	
	}

}
