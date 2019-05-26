public class ReverseLogic {
	public static String invertNumber(int a) {
		int num1 = a % 10;
		int num2 = (a / 10) % 10;
		int num3 = (a / 100) % 10;
		int num4 = (a / 1000) % 10;
		int num5 = (a / 10000) % 10;
		int num6 = (a / 100000) % 10;
                int num7 = a / 1000000;

		return "" + num1 + num2 + num3 + num4 + num5 + num6 + num7;
	}
}
