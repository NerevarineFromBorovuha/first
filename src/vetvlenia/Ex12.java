package vetvlenia;

public class Ex12 {

	public static void main(String[] args) {
		// 12. Даны три действительных числа. Возвести в квадрат те из них, значения
		// которых неотрицательны, и в четвертую степень — отрицательные.

		double a = -10;
		double b = 5;
		double c = -3;
		if (a >= 0) {
			a = a * a;
		} else {
			a = a * a * a * a;
		}

		if (b >= 0) {
			b = b * b;
		} else {
			b = b * b * b * b;
		}

		if (c >= 0) {
			c = c * c;
		} else {
			c = c * c * c * c;
		}

		System.out.println("a=" + a + "\nb=" + b + "\nc=" + c);
	}

}
