package by.epam.tr.main;

public class Ex14 {

	public static void main(String[] args) {
		// 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
		double n;
		double x = 1;
		double result;
		n = 10;

		result = 0;
		while (x <= n) {
			result = result + (1 / x);
			x = x + 1;
		}
		System.out.println("result  = " + result);

	}

}
