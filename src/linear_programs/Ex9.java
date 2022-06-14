package linear_programs;

public class Ex9 {

	public static void main(String[] args) {
		// Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения):
		double a = 3;
		double b = 0.5;
		double c = -1;
		double d = 3;
		double part1;
		double part2;
		double part3;
		part1 = (a / c) * (b * d);
		part2 = (a * b - c) / (c * d);
		part3 = part1 - part2;
		System.out.println("result of equation = " + part3);

	}

}
