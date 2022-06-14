package by.epam.tr.main;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// 27. Для каждого натурального числа в промежутке от m до n вывести все
		// делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
		Scanner sc1;
		Scanner sc2;
		int m;
		int n;
		System.out.println("enter m < n ");
		sc1 = new Scanner(System.in);
		System.out.print("m> ");
		m = sc1.nextInt();
		sc2 = new Scanner(System.in);
		System.out.print("n> ");
		n = sc2.nextInt();

		for (int i = m; i <= n; i++) {
			System.out.print("Divides " + i + ": ");
			for (int j = m; j < i; j++)
				if ((i % j) == 0)
					System.out.print(j + " ");
			System.out.println();

		}
		sc1.close();
		sc2.close();
	}
}
