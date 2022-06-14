package linear_programs;

public class Ex14 {

	public static void main(String[] args) {
		// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
		double radius = 10;
		double area;
		double length;
		area = Math.PI*radius*radius;
		length = Math.PI*2*radius;
		System.out.println("area = " + area + "\nlength = " + length);

	}

}
