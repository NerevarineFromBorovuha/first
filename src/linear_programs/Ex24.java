package linear_programs;

public class Ex24 {

	public static void main(String[] args) {
		// 24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при
		// большем основании а.
		double a = 20;
		double b = 10;
		double angleRad = 3.2;
		double area = 0.5*(a*a-b*b)*Math.tan(angleRad);
		System.out.println(" area = " + area);
		
		
		
	}

}
