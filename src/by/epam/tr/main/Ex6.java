package by.epam.tr.main;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// 6. Напишите программу, где пользователь вводит любое целое положительное
		// число. А программа суммирует все числа от 1 до введенного пользователем
		// числа.
		Scanner sc;
		int x;
		sc = new Scanner(System.in);
		System.out.print("> ");
		x = sc.nextInt();

		if (x < 0) {
			System.out.println("number is negative");
			sc.close();
			return;
			
		}
		int y;
		int sum;
		y = 1;
		sum = 0;

		while (y <= x) {
			sum = sum + y;
			y++;
		}
		System.out.println("sum = " + sum);
		sc.close();

	}

}
