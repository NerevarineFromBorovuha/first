package linear_programs;

public class Ex38b {

	public static void main(String[] args) {
		double x = -4;
		double y = -3;
		boolean a;
		boolean b;
		boolean result;
		if ((x >= -2) & (x <= 2) & (y >= 0) & (y <= 4)) {
			a = true;
		} else {
			a = false;
		}

		if ((x >= -4) & (x <= 4) & (y >= -3) & (y <= 0)) {
			b = true;
		} else {
			b = false;
		}

		if ((a == true) | (b == true)) {
			result = true;
		} else {
			result = false;
		}

		System.out.println("a = " + a + "\nb = " + b + "\nresult = " + result);
	}

}