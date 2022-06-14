package vetvlenia;

public class Ex30 {

	public static void main(String[] args) {
		// 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
		// заменить их абсолютными значениями, если это не так.
		double a = 1;
		double b = -2;
		double c = 3;
		if ((a > b) & (b > c)) {
			a = 2 * a;
			b = 2 * b;
			c = 2 * c;
			System.out.println("result if a > b > c = true  \na= " + a + " b= " + b + " c= " + c);
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println("result if a > b > c = false  \na= " + a + " b= " + b + " c= " + c);
		}

	}

}
