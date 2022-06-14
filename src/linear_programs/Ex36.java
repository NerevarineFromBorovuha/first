package linear_programs;

public class Ex36 {

	public static void main(String[] args) {
		// Найти частное произведений четных и нечетных цифр четырехзначного числа
		int a = 2222;
		int first = a / 1000;
		int second = (a / 100) % 10;
		int third = (a / 10) % 10;
		int fourth = a % 10;
		int first1;
		int ch1 = 1, ch2 = 1, ch3 = 1, ch4 = 1;
		int nch1 = 1, nch2 = 1, nch3 = 1, nch4 = 1;
		double result;
		System.out.println("first = " + first + " second = " + second + " third = " + third + " fourth = " + fourth);
		if (first % 2 == 0) {
			ch1 = first;
		} else {
			nch1 = first;
		}
		if (second % 2 == 0) {
			ch2 = second;
		} else {
			nch2 = second;
		}
		if (third % 2 == 0) {
			ch3 = third;
		} else {
			nch3 = third;
		}
		if (fourth % 2 == 0) {
			ch4 = fourth;
		} else {
			nch4 = fourth;
		}
		if (ch1 * ch2 * ch3 * ch4 == 1) {
			result = 0;
			System.out.println("result = " + result);
			return;
		}

		if (nch1 * nch2 * nch3 * nch4 == 1) {
			nch1 = 0;
		}
		result = (double) (ch1 * ch2 * ch3 * ch4) / (nch1 * nch2 * nch3 * nch4);

		System.out.println("result = " + result);
	}

}
