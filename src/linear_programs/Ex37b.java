package linear_programs;

public class Ex37b {

	public static void main(String[] args) {
		// Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
		// последних цифр.
		int a = 3416;
		int first = a / 1000;
		int second = (a / 100) % 10;
		int third = (a / 10) % 10;
		int fourth = a % 10;
		if (first + second == third + fourth) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println("first = " + first + " second = " + second + " third = " + third + " fourth = " + fourth);

	}

}
