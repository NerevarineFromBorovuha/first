package linear_programs;

public class Ex40 {

	public static void main(String[] args) {
		// Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 .
		// Позаботьтесь об экономии операций.
		double x = 5;
		double result1;
		double result2;
		result1 = (-2) * x + (3 * x * x) - (4 * x * x * x);
		result2 = 1 + (2 * x) + (3 * x * x) + (4 * x * x * x);
		System.out.println("result1 = " + result1 + "\nresult2 = " + result2);

	}

}
