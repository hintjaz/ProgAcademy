package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int x;
System.out.println("Номер комнаты: ");
x = sc.nextInt();
int pod = (x - 1)/36 + 1;
int level = (x - 36*(pod - 1) - 1)/4 + 1;
if (x > 0 && x < 145)  {
	System.out.println("Подъезд: " + pod);
	System.out.println("Этаж: " + level);
}
else {
	System.out.println("Квартира не найдена!");
}
sc.close();
	}

}
