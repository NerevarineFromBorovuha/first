package vetvlenia;

public class Ex10 {

	public static void main(String[] args) {
		// 10. Составить программу, которая определит площадь какого круга меньше.
		double radius1 = 4;
		double radius2 = 5;
		double square1;
		double square2;
		double minSq;
		square1 = Math.PI * radius1 * radius1;
		square2 = Math.PI * radius2 * radius2;
		minSq = Math.min(square1, square2);
		System.out.println("min circle square is " + minSq);

	}

}
