package vetvlenia;

public class Ex18 {

	public static void main(String[] args) {
		// 18. Подсчитать количество отрицательных среди чисел а, b, с.
		double a = 5;
		double b = -6;
		double c = 3;
		int negNumb = 0;
		if (a < 0) {
			negNumb = ++negNumb;
		}
		if (b < 0) {
			negNumb = ++negNumb;
		}
		if (c < 0) {
			negNumb = ++negNumb;
		}
		System.out.println(" We have " + negNumb + " negative numbers");
	}

}
