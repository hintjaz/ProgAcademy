package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int x;
System.out.println("Год: ");
x = sc.nextInt();

if (x%4==0) {
	System.out.println("В году 366 дней ");
}
else if (x%400==0) {
	System.out.println("В году 366 дней ");
}
else {
System.out.println("В году 365 дней ");	
}
sc.close();
	}

}
