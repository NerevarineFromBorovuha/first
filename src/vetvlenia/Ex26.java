package vetvlenia;

public class Ex26 {

	public static void main(String[] args) {
		// 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
		double a = 5;
		double b = -10;
		double c = 23;
		double max;
		double min;
		double sum;
		max = Math.max(a, b);
		max = Math.max(max, c);
		min = Math.min(a, b);
		min = Math.min(min, c);
		sum = max + min;
		System.out.println("max = " + max + "\nmin = " + min + "\nsum = " + sum);

	}

}
