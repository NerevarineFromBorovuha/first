package by.epam.tr.main;

public class Ex20 {

	public static void main(String[] args) {
		// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
		// которых больше или равен заданному е. Общий член ряда имеет вид:
		double e = 0.001;
		double sum = 0;
		double a = 0;
		double row = 100;
		for (int x = 1; x <= row; x++) {
			a = (double)1 / ((3 * x - 2) * (3 * x + 1));
			if (Math.abs(a) >= e) {
				sum = sum + a;

			}

		}
		System.out.println("sum  = " + sum);
	}
}
