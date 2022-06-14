package linear_programs;

public class Ex34 {

	public static void main(String[] args) {
		// 34. Дана величина А, выражающая объем информации в байтах. Перевести А в
		// более крупные единицы измерения информации.
		int bytes = 765902830;
		double kBytes = bytes / Math.pow(2, 10);
		double mBytes = bytes / Math.pow(2, 20);
		double gBytes = bytes / Math.pow(2, 30);
		double tBytes = bytes / Math.pow(2, 40);
		System.out.println("bytes = " + bytes + "\nkbytes = " + kBytes + "\nmbytes = " + mBytes + "\ngbytes = " + gBytes
				+ "\ntbytes = " + tBytes);

	}

}
