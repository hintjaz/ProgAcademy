package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class Task2Level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (int i = 2; i <= 100; i++) {
			boolean simple = false;
			for (int j = 2; j <= i / j; j++) {
				simple = (i % j == 0);
				if (simple) {
					break;
				}
			}

			if (!simple) {
				System.out.print(i + " ");
			}
		}
	}
}