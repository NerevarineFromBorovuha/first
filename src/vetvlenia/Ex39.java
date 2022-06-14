package vetvlenia;

public class Ex39 {

	public static void main(String[] args) {
		// Вычислить значение функции
		double x;
		double fx;
		x = 3;
		if (x >= 8) {
			fx = -(x * x) + x - 9;
		} else {
			fx = 1 / (x * x * x * x - 6);
		}
		System.out.println("F(x)= " + fx);
	}

}
