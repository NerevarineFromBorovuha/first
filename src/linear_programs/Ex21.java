package linear_programs;

public class Ex21 {

	public static void main(String[] args) {
		// 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной
		// и целой частях). Поменять местами дробную и целую части числа и вывести
		// полученное значение числа.
		double R = 123.456;
		double firstStep;
		double secondStep;
		double thirdStep;
		firstStep = (R * 1000) % 1000;
		secondStep = (int) R;
		thirdStep = (firstStep) + (secondStep / 1000);

		System.out.println("firstStep = " + firstStep + "\nsecondStep = " + secondStep + "\nresult = " + thirdStep);

	}

}
