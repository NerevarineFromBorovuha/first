package vetvlenia;

public class Ex20 {

	public static void main(String[] args) {
		// 20. Определить, делителем каких чисел а, b, с является число k.
		double a = 5;
		double b = 12;
		double c = 9;
		double k = 3;
		System.out.println("k = " + k + " a = " + a + " b = " + b + " c = " + c);
		if (a % k == 0) {
			System.out.println("a divided by k result" + a / k);
		}
		if (b % k == 0) {
			System.out.println("b divided by k result " + b / k);
		}
		if (c % k == 0) {
			System.out.println("c divided by k result " + c / k);
		}

	}

}
