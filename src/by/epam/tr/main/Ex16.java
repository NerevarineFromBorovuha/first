package by.epam.tr.main;

public class Ex16 {

	public static void main(String[] args) {
		// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
		long sum = 3;

		long result = 3;
		for (long x = sum; x <= 10; x++) {
			sum = x + sum;
			result = result * sum;

		}
		System.out.println("result  = " + result);
	}

}
