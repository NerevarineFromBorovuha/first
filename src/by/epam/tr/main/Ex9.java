	package by.epam.tr.main;

public class Ex9 {

	public static void main(String[] args) {
		// Найти сумму квадратов первых ста чисел.
		int x;
		int y;
		int sumOfSquare;
		x = 1;
		y = 100;
		sumOfSquare = 0;
		while(x <= y) {
		sumOfSquare = sumOfSquare + (x*x);
		x= x+1;
		}
		System.out.println("sumOfSquare  = " + sumOfSquare);
	}

}
