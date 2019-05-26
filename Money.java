public class Money {
	public static double convertBYRtoUSD(double money) {
		return money * 0.48;
	}

	public static double convertBYRtoEUR(double money) {
		return money * 0.43;
	}

	public static double convertUSDtoBYR(double money) {
		return money / 0.48;
	}

	public static double convertEURtoBYR(double money) {
		return money / 0.43;
	}
}