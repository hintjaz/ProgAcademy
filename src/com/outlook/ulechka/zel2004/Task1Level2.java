package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class Task1Level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите максимальную высоту фигуры");

        int height = sc.nextInt();

        int b =1;

        for (int i = 1; i <= height; ++i) {

            System.out.print("*");

            if (b <=i&&b<height) {

                System.out.println();

                b++;

                i = 0;

            }

            if (height==i){

                System.out.println();

                height--;

                i=0;

            }




        }
	}

}


