package linear_programs;

public class Ex10 {

	public static void main(String[] args) {
		// Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения):
		double x = 3;
		double y = 0.5;
		double result;
		result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
		System.out.println("result of equation = " + result);
	}

}
