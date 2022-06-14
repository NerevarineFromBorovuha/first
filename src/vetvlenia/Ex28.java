package vetvlenia;

public class Ex28 {

	public static void main(String[] args) {
		// Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
		// равно d, то найти max(d — a, d — b, d —c).
		double a = 9686;
		double b = 2423;
		double c = 3142;
		double d = 5132;
		double max;
		if (a == d) {
			System.out.println("a = d " + a);
		}
		if (b == d) {
			System.out.println("b = d " + b);
		}
		if (c == d) {
			System.out.println("c = d " + c);
		}
		if ((a != d) & (b != d) & (c != d)) {
			max = Math.max(d - a, d - b);
			max = Math.max(max, d - c);
			System.out.println("max =  " + max);
		}

	}
}