package com.outlook.ulechka.zel2004;

import java.util.Random;




public class Task1 {




 public static void main(String[] args) {

  
  int[] arr = new int[15];





  Random random = new Random();

  for(int i = 0; i < arr.length; i++){

   arr[i] = random.nextInt(100);

  }

  print(arr);

  


  System.out.println("\n" + "Максимальное число : " + maxNumber(arr));




 }

 

 private static int maxNumber(int[] arr){

  int min = 0;

  for(int i = 0; i < arr.length; i++){

   if(arr[i] > min){

    min = arr[i];

   }

  }

  return min;

 }
 

 static void print(int[] arr){

  for(int k:arr){System.out.print(k+" ");}

  }

}
