package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ��������������:");
		int height = sc.nextInt();
		System.out.println("������� ������ ��������������:");
		int width = sc.nextInt();
		if ((width <1) | (height<1)){
		System.out.println("������ �������������� �� ����������");
		}

		for (int j = 1; j <= height; j += 1) {
				for (int i = 1; i <= width; i += 1) {
					if ((i == 1) | (i == width) | (j==1) | (j==height)) {
						System.out.print("*");
					}

					else {

						System.out.print(" ");
					}
					
				}
				

				System.out.println();
			}
		}
	}

