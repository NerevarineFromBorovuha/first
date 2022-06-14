package linear_programs;

public class Ex37i {

	public static void main(String[] args) {
		// График функции у = ах2 + bх+ с проходит через заданную точку с координатами
		// (m, п).
		int m = 5;
		int n = 7;
		int a = 9;
		int b = -3;
		int c = 10;
		int y = n;
		int x = m;
		if (y == (a * x * x + b * x + c)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
