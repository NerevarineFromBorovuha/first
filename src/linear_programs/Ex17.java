package linear_programs;

public class Ex17 {

	public static void main(String[] args) {
		// Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
		// геометрическое модулей этих чисел.
		double a = 10;
		double b = -3;
		double aCube;
		double bCube;
		double arifm;
		double geom;
		aCube = a * a * a;
		bCube = b * b * b;
		arifm = (aCube + bCube) * 0.5;
		geom = Math.sqrt(Math.abs(a) * Math.abs(b));
		System.out.println("arithmetic mean = " + arifm + "\ngeometric  = " + geom);
	}

}
