package vetvlenia;

public class Ex15 {

	public static void main(String[] args) {
		// 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих
		// двух чисел заменить половиной их суммы, а большее — их удвоенным
		// произведением.
		double x = 10;
		double y = 14;
		if (x < y) {
			x = (0.5 * (x + y));
			y = (2 * x * y);
		} else {
			y = (0.5 * (x + y));
			x = (2 * x * y);
		}
		System.out.println("y = " + y + "\nx = " + x);

	}

}
