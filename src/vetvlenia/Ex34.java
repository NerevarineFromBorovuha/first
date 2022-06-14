package vetvlenia;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// 34. Составить программу, реализующую эпизод применения компьютера в книжном
		// магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
		// покупателем; если сдачи не требуется, печатает на экране «спасибо»; если
		// денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
		// указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
		// и указывает размер недостающей суммы.
		Scanner sc1;
		Scanner sc2;
		double cost;
		double pay;

		sc1 = new Scanner(System.in);
		System.out.println("Enter cost of the book ");
		System.out.print("> ");
		cost = sc1.nextDouble();

		sc2 = new Scanner(System.in);
		System.out.println("Enter payment for the book ");
		System.out.print("> ");
		pay = sc2.nextDouble();

		if (pay == cost) {
			System.out.println("That is all right");
		} else if (pay > cost) {
			System.out.println("Your change is " + (pay - cost));
		} else if (pay < cost) {
			System.out.println("You owe " + (cost - pay));

		}
		sc1.close();
		sc2.close();
	}

}
