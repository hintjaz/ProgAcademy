package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class FourthTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int a;
int b;
int c;
System.out.println("������� a:");
a = sc.nextInt();
System.out.println("������� b:");
b = sc.nextInt();
System.out.println("������� c:");
c = sc.nextInt();
if ((a < b + c) && (b < a + c ) && (c < a + b) ){
	System.out.println("����������� ����������");
}
else {
	System.out.println("����������� �� ����������");
}

sc.close();
	}

}

