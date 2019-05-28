public class ReverseLogic {
	public static int invertNumber(int a) {
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

		int num7 = a % 10;
		
		a *= 10;
		num6 *= a;

		a *= 10;
		num5 *= a;

		a *= 10;
		num4 *= a;

		a *= 10;
		num3 *= a;

		a *= 10;
		num2 *= a;

		a *= 10;
		num1 *= a;

		return num1 + num2 + num3 + num4 + num5 + num6 + num7;
	}
}