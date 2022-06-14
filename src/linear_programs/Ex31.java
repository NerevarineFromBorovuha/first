package linear_programs;

public class Ex31 {

	public static void main(String[] args) {
		// 31. Составить программу для вычисления пути, пройденного лодкой, если ее
		// скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения
		// по озеру t1 ч, а против течения реки — t2 ч.
		double vLake = 10;
		double vRiver = 5;
		double tLake = 2;
		double tRiver = 3;
		double sLake = vLake * tLake;
		double sRiver = (vLake - vRiver) * tRiver;
		System.out.println("distance on the lake = " + sLake + "\ndistance on the river =" + sRiver);

	}

}
