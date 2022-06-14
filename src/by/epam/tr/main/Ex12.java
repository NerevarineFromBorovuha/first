package by.epam.tr.main;

public class Ex12 {

	public static void main(String[] args) {
		// 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n
		// >1 Составьте программу нахождения произведения первых 10 членов этой
		// последовательности.
		int a;
		int b;
		int h;
		a = 1;
		b = 9;
		h = 1;
		long res = 1;

		for (; a <= b; a = a + h) {
			res = (6 + a) * res;

		}
		System.out.println("res =" + res);
	}

}
