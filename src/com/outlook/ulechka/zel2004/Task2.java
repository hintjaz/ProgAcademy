package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ����� �� 4 �� 16:");
		int n = sc.nextInt();
		int f = 1;
		while (n<4 || n>16) {
			System.out.println("������������ ����");
				}
				for (int i=n; i!=0; i--){
					f*=i;
				}
System.out.println("��������� ����� " + n + " ����� " + f);
sc.close();
	}

}
