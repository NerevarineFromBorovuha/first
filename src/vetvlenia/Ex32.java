package vetvlenia;

public class Ex32 {

	public static void main(String[] args) {
		// 32. Написать программу, которая по заданным трем числам определяет, является
		// ли сумма каких-либо двух из них положительной.
		double a = 10;
		double b = -12;
		double c = -15;
		if (((a + b) > 0) | ((a + c) > 0) | ((b + c) > 0)) {
			System.out.println("There are positive number.");
		} else {
			System.out.println("There aren't positive number.");
		}

	}

}
