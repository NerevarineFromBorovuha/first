package linear_programs;

public class Ex8 {

	public static void main(String[] args) {
		// Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения):
		double a = 3;
		double b = 0.5;
		double c = -1;
		double part1;
		double part2;
		double part3;
		if ((b * b * b + 4 * a * c) >= 0) {
			part1 = ((b + Math.sqrt(b * b * b + 4 * a * c)) / (2 * a));
			part2 = a * a * a * c + Math.pow((1 / b), 2);
			part3 = part1 - part2;
			System.out.println("result of equation = " + part3);
		} else {
			System.out.println("Square root < 0  ");
		}

	}

}
