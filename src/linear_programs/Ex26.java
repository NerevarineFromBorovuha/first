package linear_programs;

public class Ex26 {

	public static void main(String[] args) {
		// 26. Найти площадь треугольника, две стороны которого равны а и b, а угол
		// между этими сторонами у.
		double a = 10;
		double b = 20;
		double angleDegr = 45;
		double angleRad = Math.toRadians(angleDegr);
		double area = 0.5 * a * b * Math.sin(angleRad);
		System.out.println("area = " + area );

	}

}
