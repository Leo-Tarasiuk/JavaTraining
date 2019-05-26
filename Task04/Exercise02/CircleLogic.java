public class CircleLogic {
	public static double calcSquareCircle(double a, double b) {
		return (a > b ? Math.PI * (a * a - b * b) : Math.PI * (b * b - a * a));
	}
}
