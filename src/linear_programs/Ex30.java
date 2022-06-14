package linear_programs;

public class Ex30 {

	public static void main(String[] args) {
		// Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление
		// соединения.
		double R1 = 2;
		double R2 = 0.2;
		double R3 = 11;
		double R = 1 / (1 / R1 + 1 / R2 + 1 / R3);
		System.out.println("R = " + R);

	}

}
