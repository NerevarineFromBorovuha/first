package linear_programs;

public class Ex13 {

	public static void main(String[] args) {
		// Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти
		// его периметр и площадь
		double x1 = 2;
		double y1 = 1;
		double x2 = 1;
		double y2 = 3;
		double x3 = 5;
		double y3 = 2;
		double distanceDote1Dote2;
		double distanceDote1Dote3;
		double distanceDote2Dote3;
		double area;
		double perimeter;
		double halfPerimeter;

		distanceDote1Dote2 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
		distanceDote1Dote3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow(y1 - y3, 2));
		distanceDote2Dote3 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow(y2 - y3, 2));
		perimeter = distanceDote1Dote2 + distanceDote1Dote3 + distanceDote2Dote3;
		halfPerimeter = perimeter / 2;
		area = Math.sqrt(halfPerimeter * (halfPerimeter - distanceDote1Dote2) * (halfPerimeter - distanceDote1Dote3)
				* (halfPerimeter - distanceDote2Dote3));
		System.out.println("perimeter = " + perimeter + "\narea = " + area);

	}

}
