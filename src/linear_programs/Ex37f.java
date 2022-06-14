package linear_programs;

public class Ex37f {

	public static void main(String[] args) {
		// Треугольник со сторонами а,b,с является равнобедренным.
		int a = 12;
		int b = 13;
		int c = 42;
		if ((a == b) | (b == c) | (a == c)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
