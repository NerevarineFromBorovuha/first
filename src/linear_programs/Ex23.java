package linear_programs;

public class Ex23 {

	public static void main(String[] args) {
		// 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R
		// (R> r).
		double R = 20;
		double r = 10;
		double areaR = Math.PI * R * R;
		double arear = Math.PI * r * r;
		double area = areaR - arear;
		System.out.println("ring area = " + area);

	}

}
