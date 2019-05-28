public class AverageValue {

	private static final double Number = 6;
	public static double calcArithmeticAvarage(int a) {
		int num1 = a % 10;
		a /= 10;

		int num2 = a % 10;
		a /= 10;

		int num3 = a % 10;
		a /= 10;

		int num4 = a % 10;
		a /= 10;

		int num5 = a % 10;
		a /= 10;

		int num6 = a % 10;
		a /= 10;

		return (num1 + num2 + num3 + num4 + num5 + num6) / Number;
	}

	public static double calcGeometricAvarage(int a) {
		int num1 = a % 10;
		a /= 10;

		int num2 = a % 10;
		a /= 10;

		int num3 = a % 10;
		a /= 10;

		int num4 = a % 10;
		a /= 10;

		int num5 = a % 10;
		a /= 10;

		int num6 = a % 10;
		a /= 10;

		return Math.pow(num1 * num2 * num3 * num4 * num5 * num6, 1.0 / Number);
	}
}