package vetvlenia;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
		// месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
		Scanner sc1;
		Scanner sc2;
		int a;
		int b;
		System.out.println("enter month ");
		sc1 = new Scanner(System.in);
		System.out.print("> ");
		a = sc1.nextInt();
		System.out.println("enter day ");
		System.out.print("> ");
		sc2 = new Scanner(System.in);
		b = sc2.nextInt();
		
		if ((a > 12) | (a < 1) | (b < 1)) {
			System.out.println("Date wrong");
			sc1.close();
			sc2.close();
			return;
		}
		
		switch (a) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:

			if (b <= 31) {
				System.out.println("Date right");
			} else {
				System.out.println("Date wrong");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (b <= 30) {
				System.out.println("Date right");
			} else {
				System.out.println("Date wrong");
			}
			break;
		case 2:
			if (b <= 28) {
				System.out.println("Date right");
			} else {
				System.out.println("Date wrong");
			}
			break;
		}
		sc1.close();
		sc2.close();

	}

}
