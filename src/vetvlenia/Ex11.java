package vetvlenia;

public class Ex11 {

	public static void main(String[] args) {
		// 11. Составить программу, которая определит площадь какого треугольника
		// больше.
		double a1 = 1;
		double h1 = 2;
		double a2 = 3;
		double h2 = 4;
		double square1;
		double square2;
		double maxSq;
		square1 = 0.5 * a1 * h1;
		square2 = 0.5 * a2 * h2;
		if (square1 > square2) {
			maxSq = square1;
		} else {
			maxSq = square2;
		}
		System.out.println("max triangle square is = " + maxSq);

	}

}
