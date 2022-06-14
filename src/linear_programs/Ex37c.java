package linear_programs;

public class Ex37c {

	public static void main(String[] args) {
		// Сумма цифр данного трехзначного числа N является четным числом.
		int a = 341;
		int first = a / 100;
		int second = (a / 10) % 10;
		int third = a % 10;
		System.out.println("first = " + first + " second = " + second + " third = " + third);
		if ((first + second + third) % 2 == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
