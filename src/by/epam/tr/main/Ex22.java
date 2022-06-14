package by.epam.tr.main;

public class Ex22 {

	public static void main(String[] args) {
		// Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
		// шагом h.
		double a;
		double b;
		double h;
		double y;

		a = 14;
		b = 16;
		h = 0.2;

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x = x + h) {
			y = (Math.sin(x)) * (Math.sin(x));
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");

	}

}