package linear_programs;

public class Ex27 {

	public static void main(String[] args) {
		// 27. Дано значение a. Не используя никаких функций и никаких операций, кроме
		// умножения, получить значение а8 за три операции и а10 за четыре операции.
		
		double a = 2;
		double first = a*a;
		double second = first*first;
		double third = second*second;
		double fourth = third*first;
		System.out.println("a^8 = " + third + "\na^10 = " + fourth);

	}

}
