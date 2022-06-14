package vetvlenia;

public class Ex8 {

	public static void main(String[] args) {
		// 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		double a = 1;
		double b = 2;
		double minSq;
		if (a * a > b * b) {
			minSq = b * b;
		} else {
			minSq = a * a;
		}
		System.out.println("min = " + minSq);

	}

}
