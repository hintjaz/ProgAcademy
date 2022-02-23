package com.outlook.ulechka.zel2004;

import java.util.Scanner;




public class Task5 {




 public static void main(String[] args) {



  Scanner sc = new Scanner(System.in);

  System.out.println("¬ведите текст : ");

  String text = sc.nextLine(); 

  sc.close(); 

  

  System.out.println(wordCalculator(text));

  

 }

 

 private static int wordCalculator(String text) {

  text = text.trim();

  String[] words = text.split(" ");

  return words.length;

 }

}

