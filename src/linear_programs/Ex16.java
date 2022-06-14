package linear_programs;

public class Ex16 {

	public static void main(String[] args) {
		// 16. Найти произведение цифр заданного четырехзначного числа.

		int a = 1234;
		int first = 0;
		int second = 0;
		int third = 0;
		int fourth;
		int resMult;
		fourth = a % 10;
		third = (a / 10) % 10;
		second = (a / 100) % 10;
		first = a / 1000;
		resMult = first * second * third * fourth;
		System.out.println("first = " + first + "\nsecond = " + second + "\nthird = " + third + "\nfourth = " + fourth
				+ "\nresult = " + resMult);

	}

}
