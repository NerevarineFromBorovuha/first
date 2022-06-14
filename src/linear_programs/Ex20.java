package linear_programs;

public class Ex20 {

	public static void main(String[] args) {
		// Известна длина окружности. Найти площадь круга, ограниченного этой
		// окружностью.
		double length = 10;
		double radius = length / (Math.PI * 2);
		double area = Math.PI * radius * radius;
		System.out.println("circle area = " + area);

	}

}
