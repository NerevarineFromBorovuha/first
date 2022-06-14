package linear_programs;

public class Ex35 {

	public static void main(String[] args) {
		// 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и
		// младшую цифру целой части числа M/N.

		int m = 333;
		int n = 7;

		double result = (double) m / n;

		int afterDote = (int) (result % 10);
		int beforeDote = (int) ((result * 10) % 10);

		System.out.println(m + " / " + n + " = " + result);
		System.out.println("Number before dote: " + beforeDote);
		System.out.println("Number after dote: " + afterDote);

	}

}
