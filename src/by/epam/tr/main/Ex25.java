package by.epam.tr.main;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// 25. Требуется определить факториал числа, которое ввел пользователь.
		Scanner sc;
		int x;
		int result = 1;
		sc = new Scanner(System.in);
		System.out.println("Enter factorial ");
		System.out.print("> ");
		x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			result = i * result;
			
		}
		System.out.println("result = " + result);
		sc.close();
	}

}
