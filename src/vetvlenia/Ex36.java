package vetvlenia;

public class Ex36 {

	public static void main(String[] args) {
		// Вычислить значение функции
		double x;
		double fx;
		x = 4;
		if (x <= 3) {
			fx = x * x - 3 * x + 9;
		} else {
			fx = (1 / (x * x * x + 6));
		}
		System.out.println("F(x)= " + fx);
	}

}
