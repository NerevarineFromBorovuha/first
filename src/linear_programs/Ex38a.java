package linear_programs;

public class Ex38a {

	public static void main(String[] args) {
		// Для данных областей составить линейную программу, которая печатает true, если
		// точка с координатами (х, у) принадлежит закрашенной области, и false — в
		// противном случае
		int x = 1;
		int y = 1;
		if ((y >= 0) & (y <= -Math.abs(x) + 4)) { // функция y=-|x| + 4
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
