package linear_programs;

public class Ex37h {

	public static void main(String[] args) {
		// Заданное число N является степенью числа а (показатель степени может
		// находиться в диапазоне от 0 до 4).
		int N = 1;
		int a = 2;
		int temp1 = 1;
		int temp2 = a * a;
		int temp3 = a * a * a;
		int temp4 = a * a * a * a;
		if ((temp1 == N) | (temp2 == N) | (temp3 == N) | (temp4 == N)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
