package com.outlook.ulechka.zel2004;

import java.util.Scanner;




public class Task3 {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¬ведите длину пр€моугольника: ");

        int lenght = sc.nextInt();

        System.out.println("¬ведите ширину пр€моугольника: ");

        int altitude = sc.nextInt();

        brushRectangle(lenght,altitude);




    }

    public static void brushRectangle(int a, int b){

        for(int i=1;i<=b;i++){

            for(int j=1;j<=a;j++){

                System.out.print("* ");

            }

            System.out.println();

        }

    }

}


