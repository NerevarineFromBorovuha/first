package vetvlenia;

public class Ex31 {

	public static void main(String[] args) {
		// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		// Определить, пройдет ли кирпич через отверстие.
		double a = 12, b = 6;
		double x = 5, y = 9, z = 22;
		if ((a > x) & (b > y)) {
			System.out.println("Good.");
		} else if ((a > y) & (b > x)) {
			System.out.println("Good.");
		} else if ((a > x) & (b > z)) {
			System.out.println("Good.");
		} else if ((a > z) & (b > x)) {
			System.out.println("Good.");
		} else if ((a > y) & (b > z)) {
			System.out.println("Good.");
		} else if ((a > z) & (b > y)) {
			System.out.println("Good.");
		} else {
			System.out.println(" Not good");
		}

	}

}
