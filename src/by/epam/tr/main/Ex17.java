package by.epam.tr.main;

public class Ex17 {

	public static void main(String[] args) {
		// 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
		double a = 2;
		int n = 5;
		double result = 1;
		for (int x = 0; x < n; x++) {
			result = result * (x + a);
			System.out.println("result  = " + result);
		}

	}

}
