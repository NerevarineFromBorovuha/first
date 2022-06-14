package linear_programs;

public class Ex28 {

	public static void main(String[] args) {
		// Составить программу перевода радианной меры угла в градусы, минуты и секунды.
		double angleRad = 5.1;
		double angleDegreeSave = angleRad * 180 / Math.PI;
		int angleDegree = (int) angleDegreeSave;
		double angleMinutesSave = (angleDegreeSave - angleDegree) * 60;
		int angleMinutes = (int) angleMinutesSave;
		double angleSecondsSave = (angleMinutesSave - angleMinutes) * 60;
		int angleSeconds = (int) angleSecondsSave;

		System.out.println("In " + angleRad + " radians: " + angleDegree + " degries " + angleMinutes + " minutes "
				+ angleSeconds + " seconds");

	}

}
