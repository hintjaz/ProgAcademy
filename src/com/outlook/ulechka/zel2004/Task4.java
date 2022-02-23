package com.outlook.ulechka.zel2004;

import java.util.Scanner;




public class Task4 {




 public static void main(String[] args) {

  // TODO Auto-generated method stub

  System.out.println("¬ведите размер массива : ");

  Scanner sc = new Scanner(System.in);

  int arraySize = sc.nextInt();

  

  int a [] = new int [arraySize];

  for (int i = 0; i < arraySize; i++){

   Scanner sc1 = new Scanner(System.in);

   a[i] = sc1.nextInt();

  }

  

  String result = new String("");

  for ( int b : a) {

   //result += b + " ";

   result = result + b + " ";

  }




  System.out.println("Massive is: [" + result + "]");

  

  System.out.println(searchNum(a));

  

  sc.close();

}

 

  public static int searchNum(int[] a) {

   Scanner sc1 = new Scanner(System.in);

   System.out.println("Input number to find: ");

   int elem = sc1.nextInt();

   int unit = -1;

   

   for (int i = 0; i < a.length; i++) {

           if (a[i] == elem){

            unit = i;

           }

      }

   return unit;

  }

}


