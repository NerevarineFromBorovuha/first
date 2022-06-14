package vetvlenia;

public class Ex27 {

	public static void main(String[] args) {
		// 27. Найти max{min(a, b), min(c, d)}.
		double a = 9686;
		double b = 2423;
		double c = 3142;
		double d = 5132;
		double max = Math.max((Math.min(a, b)), Math.min(c, d));
		System.out.println("max = " + max);

	}

}
