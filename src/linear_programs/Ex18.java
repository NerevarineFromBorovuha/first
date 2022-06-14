package linear_programs;

public class Ex18 {

	public static void main(String[] args) {
		// Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
		// объем этого куба.
		double a = 10;
		double areaSide;
		double areaCube;
		double volCube;
		areaSide = a * a;
		areaCube = areaSide * 6;
		volCube = a * a * a;
		System.out.println("area cube side = " + areaSide + "\ncube area  = " + areaCube + "\ncube volume  = " + volCube);

	}

}
