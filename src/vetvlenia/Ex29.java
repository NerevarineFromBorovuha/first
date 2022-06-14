package vetvlenia;

public class Ex29 {

	public static void main(String[] args) {
		// 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
		// расположены на одной прямой. S=1/2((х1-х3)(у2-у3)-(х2-х3)(у1-у3))
		double x1 = 1;
		double y1 = 2;
		double x2 = 3;
		double y2 = 4;
		double x3 = 5;
		double y3 = 6;
		double areaTriangleABC;
		areaTriangleABC = 0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
		System.out.println("areaTriangleABC = " + areaTriangleABC);
		if (areaTriangleABC == 0) {
			System.out.println("points on the line  ");
		} else {
			System.out.println("points are not on the line  ");
		}

	}

}
