package linear_programs;

public class Ex19 {

	public static void main(String[] args) {
		// Дана сторона равностороннего треугольника. Найти площадь этого треугольника,
		// его высоту, радиусы вписанной и описанной окружностей.

		double side = 10;
		double area = Math.sqrt(3) * side * side / 4;
		double h = 2 * area / side;
		double r = Math.sqrt((area / (3 * Math.sqrt(3))));
		double R = Math.sqrt((area * 3) / (3 * Math.sqrt(3)));
		System.out.println(
				"area = " + area + "\nheight  = " + h + "\ninner radius  = " + r + "\nexternal radius  = " + R);

	}

}
