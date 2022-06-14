package linear_programs;

public class Ex22 {

	public static void main(String[] args) {
		// Дано натуральное число Т, которое представляет длительность прошедшего
		// времени в секундах.
		// Вывести данное значение длительности в часах, минутах и секундах в следующей
		// форме: ННч ММмин SSc.

		int numberOfSeconds = 0;
		int hour, min, sec;
		int saveNumberOfSeconds;
		numberOfSeconds = 12543;
		saveNumberOfSeconds = numberOfSeconds;
		if ((numberOfSeconds > 86400) || (numberOfSeconds < 0)) {
			System.out.println("wrong");
			return;
		}
		hour = numberOfSeconds / 3600;
		numberOfSeconds = numberOfSeconds - hour * 3600;
		min = numberOfSeconds / 60;
		numberOfSeconds = numberOfSeconds - min * 60;
		sec = numberOfSeconds;
		System.out.println("In " + saveNumberOfSeconds + " seconds: " + hour + " hour " + min + " minutes " + sec + " seconds");
	}

}
