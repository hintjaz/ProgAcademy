package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число от 4 до 16:");
		int n = sc.nextInt();
		int f = 1;
		while (n<4 || n>16) {
			System.out.println("Неправильный ввод");
				}
				for (int i=n; i!=0; i--){
					f*=i;
				}
System.out.println("Факториал числа " + n + " равен " + f);
sc.close();
	}

}
