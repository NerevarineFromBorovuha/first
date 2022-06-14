package linear_programs;

public class Ex37e {

	public static void main(String[] args) {
		// Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
		int a = 123;
		int first = a / 100;
		int second = (a / 10) % 10;
		int third = a % 10;
		if ((a * a) == Math.pow((first + second + third), 3)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
