package linear_programs;

public class Ex39 {

	public static void main(String[] args) {
		// 39. Дано действительное число х. Не пользуясь никакими другими
		// арифметическими операциями, кроме умножения, сложения и вычитания, вычислите
		// за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6.
		double x = 5;
		double result;
		result = (2 * x * x * x * x) - (3 * x * x * x) + (4 * x * x) - (5 * x) + 6;
		System.out.println("result = " + result);

	}

}
