package linear_programs;

public class Ex38c {

	public static void main(String[] args) {
		// полукруги
		int x = 5;
		int y = 0;
		boolean a;
		boolean b;
		boolean result;
		if ((x >= 0) & (x * x + y * y <= 16)) {
			a = true;
		} else {
			a = false;
		}
		if ((x >= 0) & (x * x + y * y <= 25) & (y <= 0)) {
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