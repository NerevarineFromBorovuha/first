package linear_programs;

public class Ex37a {

	public static void main(String[] args) {
		// Целое число N является четным двузначным числом.
		int n = 40;
		if ((n%2==0) && (n/100==0) && (n/10!=0)){
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
