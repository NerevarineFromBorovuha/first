package vetvlenia;

public class Ex7 {

	public static void main(String[] args) {
		// 7.Составить программу нахождения модуля выражения a*x*x + b*x + c при
		// заданных значениях a, b, c и х
		double a = 1;
		double b = 2;
		double c = -5;
		double x = -2;
		double mod;
		mod = Math.abs(a * x * x + b * x + c);
		System.out.println("module = " + mod);

	}

}
