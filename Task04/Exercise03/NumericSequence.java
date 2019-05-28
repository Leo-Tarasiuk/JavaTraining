public class NumericSequence {
	public static boolean checkIncreaseSequence(int a) {
		int num1 = a % 10;
		a /= 10;

		int num2 = a % 10;
		a /= 10;

		int num3 = a % 10;
		a /= 10;

		int num4 = a % 10;
		a /= 10;
		
        	return num1 > num2 && (num2 > num3 & num3 > num4);
    	}

	public static boolean checkDecreaseSequence(int a) {
		int num1 = a % 10;
		a /= 10;

		int num2 = a % 10;
		a /= 10;

		int num3 = a % 10;
		a /= 10;

		int num4 = a % 10;
		a /= 10;
		
        	return num1 < num2 && (num2 < num3 & num3 < num4);
    	}
}