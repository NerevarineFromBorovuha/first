package vetvlenia;

public class Ex22 {

	public static void main(String[] args) {
		// 22. Перераспределить значения переменных х и у так, чтобы в х оказалось
		// большее из этих значений, а в y - меньшее.
		double x = 10;
		double y = 14;
		double tempX = x;
		double tempY = y;
		if (x < y) {
			x = y;
			y = tempX;
		} else {
			y = x;
			x = tempY;
		}
		System.out.println("y = " + y + "\nx = " + x);

	}

}
