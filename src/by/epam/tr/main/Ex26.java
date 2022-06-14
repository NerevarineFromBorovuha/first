package by.epam.tr.main;

public class Ex26 {

	public static void main(String[] args) {
		// 26. Вывести на экран соответствий между символами и их численными
		// обозначениями в памяти компьютера (Таблицу ASCII).
		for (int i = 1; i <= 128; i++) {
			System.out.println(i + " " + (char) i);
		}
	}

}
