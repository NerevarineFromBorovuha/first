package linear_programs;

public class Ex29 {

	public static void main(String[] args) {
		// Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
		double a = 10;
		double b = 12;
		double c = 14;
		double AngleA = Math.acos((b * b + c * c - a * a) / (2 * b * c));
		double AngleB = Math.acos((a * a + c * c - b * b) / (2 * a * c));
		double AngleC = Math.acos((a * a + b * b - c * c) / (2 * a * b));
		
		double AngleADegr = Math.toDegrees(AngleA);
		double AngleBDegr = Math.toDegrees(AngleB);
		double AngleCDegr = Math.toDegrees(AngleC);
		
		System.out.println("Angle A (RAD) = " + AngleA + " Angle A (DEGR) = " + AngleADegr + " \nAngle B (RAD) = " + AngleB + " Angle B (DEGR) = "
				+ AngleBDegr + " \nAngle C (RAD) = " + AngleC + " Angle C (DEGR) = " + AngleCDegr );

	}

}
