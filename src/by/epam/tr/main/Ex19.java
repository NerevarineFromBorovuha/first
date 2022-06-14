package by.epam.tr.main;

public class Ex19 {

	public static void main(String[] args) {
		// 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		// модуль которых больше или равен заданному е. Общий член ряда имеет вид:
		double e = 0.01;
		double sum = 0;
		double a;
		double row = 100;
		for (int x = 1; x <= row; x++) {
			a = (1 / Math.pow(2, x)) + (1 / Math.pow(3, x));
			if (Math.abs(a) >= e) {
				sum = sum + a;

			}

		}
		System.out.println("sum  = " + sum);
	}

}