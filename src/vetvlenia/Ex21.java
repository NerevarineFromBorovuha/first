package vetvlenia;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
		// девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
		// текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
		Scanner sc;
		char c;
		sc = new Scanner(System.in);
		System.out.println("Are you a boy or a girl? Enter B or G.");
		System.out.print("> ");
		c = sc.next().charAt(0);
		if (c == 'B') {
			System.out.println("I like boys");
		}
		if (c == 'G') {
			System.out.println("I like girls");

		}
		sc.close();
	}

}
