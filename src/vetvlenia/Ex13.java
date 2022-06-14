package vetvlenia;

public class Ex13 {

	public static void main(String[] args) {
		// 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
		// которая из точек находится ближе к началу координат.
		double x1 = 2;
		double y1 = 1;
		double x2 = -5;
		double y2 = 1;
		double distance1;
		double distance2;
		distance1 = Math.sqrt((x1 * x1) + (y1 * y1));
		distance2 = Math.sqrt((x2 * x2) + (y2 * y2));
		if (distance1 > distance2) {
			System.out.println("the point B is closer to the center ");
		} else {
			System.out.println("the point A is closer to the center ");
		}

	}

}
