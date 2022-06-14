package linear_programs;

public class Ex25 {

	public static void main(String[] args) {
		// 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными
		// коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения
		// неотрицателен).
		int a = 2;
		int b = 23;
		int c = -5;
		int D = b * b - 4 * a * c;
		double x1 = (-b + Math.sqrt(D)) / (2 * a);
		double x2 = (-b - Math.sqrt(D)) / (2 * a);
		System.out.println("D = " + D + "\nx1 = " + x1 + "\nx2 = " + x2);

	}

}
