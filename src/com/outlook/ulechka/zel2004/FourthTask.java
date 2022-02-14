package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class FourthTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int a;
int b;
int c;
System.out.println("¬ведите a:");
a = sc.nextInt();
System.out.println("¬ведите b:");
b = sc.nextInt();
System.out.println("¬ведите c:");
c = sc.nextInt();
if ((a < b + c) && (b < a + c ) && (c < a + b) ){
	System.out.println("“реугольник существует");
}
else {
	System.out.println("“реугольник не существует");
}

sc.close();
	}

}

