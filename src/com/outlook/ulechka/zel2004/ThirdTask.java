package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int x;
System.out.println("���: ");
x = sc.nextInt();

if (x%4==0) {
	System.out.println("� ���� 366 ���� ");
}
else if (x%400==0) {
	System.out.println("� ���� 366 ���� ");
}
else {
System.out.println("� ���� 365 ���� ");	
}
sc.close();
	}

}
