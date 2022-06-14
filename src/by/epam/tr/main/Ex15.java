package by.epam.tr.main;

public class Ex15 {

	public static void main(String[] args) {
		// Вычислить : 1+2+4+8+...+ 2 в 10 степени.
		double n;
		double x = 1;
		double result;
		n = Math.pow(2, 10);

		result = 0;
		while (x <= n) {
			result = result + x * 2;
			x = x * 2;

		}
		System.out.println("result  = " + result);

	}

}
