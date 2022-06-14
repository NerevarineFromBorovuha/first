package by.epam.tr.main;

public class Ex10 {

	public static void main(String[] args) {
		// 10.Составить программу нахождения произведения квадратов первых двухсот чисел
		int x;
		int y;
		long multOfSquare;
		x = 1;
		y = 200;
		multOfSquare = 1;
		while (x <= y) {
			multOfSquare = multOfSquare * x * x;
			x = x+1;
		}
		System.out.println("multOfSquare  = " + multOfSquare);

	}

}
