package linear_programs;

public class Ex33 {

	public static void main(String[] args) {
		// 33. Ввести любой символ и определить его порядковый номер, а также указать
		// предыдущий и последующий символы.
		char a = '$';
		int number = (int) a;
		int numberPlus1 = number + 1;
		char aPlus1 = (char) numberPlus1;
		int numberMinus1 = number - 1;
		char aMinus1 = (char) numberMinus1;
		System.out.println("symbol = " + a + " number symbol  = " + number + "\nsymbol minus 1 = " + aMinus1 + "  "
				+ numberMinus1 + "\nsymbol plus 1 = " + aPlus1 + "  " + numberPlus1);

	}

}
