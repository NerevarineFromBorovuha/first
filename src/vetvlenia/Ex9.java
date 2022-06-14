package vetvlenia;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// 9. Составить программу, которая определит по трем введенным сторонам,
		// является ли данный треугольник равносторонним.
		Scanner sc1;
		Scanner sc2;
		Scanner sc3;
		int a;
		int b;
		int c;
		System.out.println("enter a b c ");
		sc1 = new Scanner(System.in);
		System.out.print("> ");
		a = sc1.nextInt();
		sc2 = new Scanner(System.in);
		System.out.print("> ");
		b = sc2.nextInt();
		sc3 = new Scanner(System.in);
		System.out.print("> ");
		c = sc3.nextInt();
		System.out.println("a = " + a + " b = " + b + " c = " + c);

		if ((a == b) & (b == c)) {
			System.out.println(" equilateral triangle");
		} else {
			System.out.println(" not equilateral triangle");
		}
		sc1.close();
		sc2.close();
		sc3.close();
	}
}