package vetvlenia;

public class Ex14 {

	public static void main(String[] args) {
		// 14.Даны два угла треугольника (в градусах). Определить, существует ли такой
		// треугольник, и если да, то будет ли он прямоугольным.
		double angle1 = 82;
		double angle2 = 65;
		double angle3 = 30;
		double sumAngles = angle1 + angle2 + angle3;

		if (sumAngles != 180) {
			System.out.println("triangle isn't exist");
		} else if ((angle1 == 90) | (angle2 == 90) | (angle3 == 90)) {
			System.out.println("triangle is exist \nright triangle");
		} else {
			System.out.println("triangle is exist");
		}
	}
}