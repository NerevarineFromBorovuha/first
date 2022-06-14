package linear_programs;

public class Ex37g {

	public static void main(String[] args) {
		// Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна
		// третьей цифре.
		int a = 153;
		int first = a / 100;
		int second = (a / 10) % 10;
		int third = a % 10;
		if ((first + second == third) | (first + third == second) | (second + third == first)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
