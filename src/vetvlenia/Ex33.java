package vetvlenia;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// 33. Написать программу, которая по паролю будет определять уровень доступа
		// сотрудника к секретной информации в базе данных. Доступ к базе имеют только
		// шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
		// пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
		// модули баз В, С; 9455, 8997 — доступен модуль базы С.

		Scanner sc;
		int x;
		sc = new Scanner(System.in);
		System.out.println("Enter password ");
		System.out.print("> ");
		x = sc.nextInt();
		if ((x == 9583) | (x == 1747)) {
			System.out.println("You have access A,B,C ");
		} else if ((x == 3331) | (x == 7922)) {
			System.out.println("You have access B,C ");
		} else if ((x == 9455) | (x == 8997)) {
			System.out.println("You have access C ");
		} else {
			System.out.println("You don't have access ");

		}
		sc.close();
	}

}
