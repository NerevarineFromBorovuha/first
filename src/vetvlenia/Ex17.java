package vetvlenia;

public class Ex17 {

	public static void main(String[] args) {
		// 17. Даны целые числа m, n. Если числа не равны, то заменить каждое из них
		// одним и тем же числом, равным большему из исходных, а если равны, то заменить
		// числа нулями.
		int m = 7;
		int n = 7;
		if (m == n) {
			m = 0;
			n = 0;
		} else {
			m = Math.max(m, n);
			n = Math.max(m, n);
		}
		System.out.println("m = " + m + "\nn = " + n);

	}

}
