package linear_programs;

public class Ex32 {

	public static void main(String[] args) {
		// 32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к
		// с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?
		int hoursStart = 14;
		int minutesStart = 3;
		int secondsStart = 44;

		int hoursPlus = 2;
		int minutesPlus = 42;
		int secondsPlus = 23;

		int hoursStartInSec = hoursStart * 3600 + minutesStart * 60 + secondsStart;
		int hoursPlusInSec = hoursPlus * 3600 + minutesPlus * 60 + secondsPlus;

		int SecondsRes = hoursStartInSec + hoursPlusInSec;
		int hoursRes = (SecondsRes / 3600);
		int minutesRes = ((SecondsRes - (hoursRes * 3600)) / 60);
		int secondsRes = (SecondsRes - (hoursRes * 3600)) - minutesRes * 60;

		int temp;
		int hours24Format = 0;
		if (hoursRes > 23) {
			temp = (hoursRes / 24);
			hours24Format = hoursRes - temp * 24;
		} else {
			hours24Format = hoursRes;
		}

		System.out.println("Now: " + hoursStart + " hours. " + minutesStart + " min. " + secondsStart + " sec.");
		System.out.println("After: " + hoursPlus + " hours. " + minutesPlus + " min. " + secondsPlus + " sec.");
		System.out.println("Will: " + hours24Format + " hours. " + minutesRes + " min. " + secondsRes + " sec.");

	}

}
