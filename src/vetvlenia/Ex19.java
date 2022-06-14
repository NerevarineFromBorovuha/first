package vetvlenia;

public class Ex19 {

	public static void main(String[] args) {
		// 19. Подсчитать количество положительных среди чисел а, b, с.
		double a = 5;
		double b = -1;
		double c = 3;
		int posNumb = 0;
		if (a > 0) {
			posNumb = ++posNumb;
		}
		if (b > 0) {
			posNumb = ++posNumb;
		}
		if (c > 0) {
			posNumb = ++posNumb;
		}
		System.out.println(" We have " + posNumb + " positive numbers");
	}

}
