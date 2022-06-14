package linear_programs;

public class Ex11 {

	public static void main(String[] args) {
		// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух
		// катетов
		double cat1 = 10;
		double cat2 = 5;
		double hypotenuse;
		double perimeter;
		double area;
		hypotenuse = Math.sqrt(cat1 * cat1 + cat2 * cat2);
		perimeter = cat1 + cat2 + hypotenuse;
		area = 0.5 * cat1 * cat2;
		System.out.println("area = " + area + "\nperimeter = " + perimeter);

	}

}
