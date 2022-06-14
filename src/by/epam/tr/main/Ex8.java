package by.epam.tr.main;

public class Ex8 {

	public static void main(String[] args) {
		// 8.Вычислить значения функции на отрезке [а,b] c шагом h
		double a;
		double b;
		double h;
		double y;
		double c;
		double d;
		a = 14;
		b = 16;
		h = 0.2;
		c = 2.0;
		d = 15;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x = x + h) {
			if (x != d) {
				y = ((x - c) + 6);
			} else {
				y = ((x + c) * 2);
			}
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");

	}

}
