package vetvlenia;

public class Ex16 {

	public static void main(String[] args) {
		// 16. На плоскости ХОY задана своими координатами точка А. Указать, где она
		// расположена (на какой оси или в каком координатном угле).
		double x = 0;
		double y = 0;
		if ((x == 0) & (y == 0)) {
			System.out.println("dote on X/Y line");

			if ((x > 0) & (y > 0)) {
				System.out.println("dote on first quarter");
			} else if ((x < 0) & (y > 0)) {
				System.out.println("dote on second quarter");
			} else if ((x < 0) & (y < 0)) {
				System.out.println("dote on third quarter");
			} else if ((x > 0) & (y < 0)) {
				System.out.println("dote on fourth quarter");

			}
		}
	}
}