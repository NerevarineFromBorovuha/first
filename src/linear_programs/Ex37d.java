package linear_programs;

public class Ex37d {

	public static void main(String[] args) {
		// Точка с координатами (х, у) принадлежит части плоскости, лежащей между
		// прямыми х= т, х= п (т<п).
		int m = 5;
		int n = 10;
		int x = 5;
		int y = 70000000;
		if ((x >= m) & (x < n)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
