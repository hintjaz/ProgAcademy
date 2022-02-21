package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("¬ведите число:");
		n = sc.nextInt();
		for (int i = 1; i <= n; i += 1) {
			for (int j = 1;j <= n; j += 1) {
				if (j%2==0){
				System.out.print("+++");
				}
				else{
					System.out.print("***");
				}
			
			}
			 
			
			System.out.println();
		}
		sc.close();
	}
		
	}



