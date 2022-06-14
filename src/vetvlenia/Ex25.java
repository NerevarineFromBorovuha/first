package vetvlenia;

public class Ex25 {

	public static void main(String[] args) {
		// 25. Написать программу — модель анализа пожарного датчика в помещении,
		// которая выводит сообщение «Пожароопасная ситуация », если температура в
		// комнате превысила 60° С.
		double t = 70;
		if (t > 60) {
			System.out.println("Alert, fire!!");
		} else {
			System.out.println("Normal situation");
		}

	}

}
