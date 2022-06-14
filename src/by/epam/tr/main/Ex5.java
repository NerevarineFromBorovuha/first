package by.epam.tr.main;

public class Ex5 {

	public static void main(String[] args) {
		// 5. С помощью оператора while напишите программу определения суммы всех
		// нечетных чисел в диапазоне от 1 до 99 включительно.
		int x;
		int y;
		int sum;
		x = 1;
		y = 99;
		sum = 0;
		while (x <= y) {
			sum = sum + x;
			x = x + 2;
		}
		System.out.println("sum = " + sum);

	}

}
