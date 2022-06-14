package by.epam.tr.main;

public class Ex11 {

	public static void main(String[] args) {
		// 11. Составить программу нахождения разности кубов первых двухсот чисел
		int x;
		int y;
		long diffOfCube;
		x = 1;
		y = 200;
		diffOfCube = 1;
		while (x <= y) {
			diffOfCube = diffOfCube -(x * x * x);
			x = x+1;
		}
		System.out.println("diffOfCube  = " + diffOfCube);

	}

}
