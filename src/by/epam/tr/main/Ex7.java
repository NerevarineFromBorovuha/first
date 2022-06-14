package by.epam.tr.main;

public class Ex7 {

	public static void main(String[] args) {
		// 7.Вычислить значения функции на отрезке [а,b] c шагом h
		double a;
		double b;
		double h;
		double y;
		a = 1.5;
		b = 3.0;
		h = 0.1;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x = x + h) {
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");

	}

}
