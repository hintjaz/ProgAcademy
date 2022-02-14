package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class FourthTaskLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите шестизначное число: ");
		int a = sc.nextInt();
		int [] b = new int[6];
		for (int i = 0; i <= 5; i++) {
			b[i] = a%10;
			a = a/10;
		}
		
		if (b[0]==b[5] && b[1]==b[4] && b[2]==b[3]) {
			System.out.println("Число является палиндромом!");
		}
		else {
			System.out.println("Число НЕ является палиндромом");
		}
		sc.close();
		

	}

}
