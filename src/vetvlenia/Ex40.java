package vetvlenia;

public class Ex40 {

	public static void main(String[] args) {
		// Вычислить значение функции
		double x;
		double fx;
		x = 3;
		if (x <= 13) {
			fx = -(x * x * x) + 9;
		} else {
			fx = -(3 / (x + 1));
		}
		System.out.println("F(x)= " + fx);
	}

}