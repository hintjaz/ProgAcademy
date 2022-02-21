package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class Task4Level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("¬ведите ширину фигуры");

        n = sc.nextInt();




        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i >= j & i >= (n + 1) - j | (i <= j & i <= (n + 1) - j)) {

                    System.out.print("*");




                } else {

                    System.out.print(" ");

                }

                if (j % n == 0) {

                    System.out.println("");

                }

            }

        }

    }




	}


