package linear_programs;

public class Ex12 {

	public static void main(String[] args) {
		// Вычислить расстояние между двумя точками с данными координатами (х1, у1)и
		// (x2, у2)
		double x1 = 2;
		double y1 = 1;
		double x2 = 1;
		double y2 = 1;
		double distance;
		distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
		System.out.println("distance = " + distance);

	}

}
