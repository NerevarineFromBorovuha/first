package vetvlenia;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// 35. Вычислить число и месяц в невисокосном году по номеру дня.
		Scanner sc;
		int x;
		sc = new Scanner(System.in);
		System.out.println("Enter date ");
		System.out.print("> ");
		x = sc.nextInt();
		if ((x > 365) | (x < 1)) {
			System.out.println("Wrong date ");
			sc.close();
			return;
		}
		if (x <= 31) {
			System.out.println("January " + x);
		} else if ((x > 31) & (x <= 59)) {
			System.out.println("February " + (x - 31));
		} else if ((x > 59) & (x <= 90)) {
			System.out.println("March " + (x - 59));
		} else if ((x > 90) & (x <= 120)) {
			System.out.println("April " + (x - 90));
		} else if ((x > 120) & (x <= 151)) {
			System.out.println("May " + (x - 120));
		} else if ((x > 151) & (x <= 181)) {
			System.out.println("June " + (x - 151));
		} else if ((x > 181) & (x <= 212)) {
			System.out.println("July " + (x - 181));
		} else if ((x > 212) & (x <= 243)) {
			System.out.println("August " + (x - 212));
		} else if ((x > 243) & (x <= 273)) {
			System.out.println("September " + (x - 243));
		} else if ((x > 273) & (x <= 304)) {
			System.out.println("October	 " + (x - 273));
		} else if ((x > 304) & (x <= 334)) {
			System.out.println("November " + (x - 304));
		} else if ((x > 334) & (x <= 365)) {
			System.out.println("December " + (x - 334));
		}
		sc.close();
	}

}
