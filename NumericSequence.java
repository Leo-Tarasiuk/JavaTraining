public class NumericSequence {
	public static boolean checkNumber(int a) {
        	int num1 = a % 10;
        	int num2 = (a / 10) % 10;
        	int num3 = (a / 100) % 10;
        	int num4 = a / 1000;

        	return ((num1 > num2 && (num2 > num3 & num3 > num4)) ? true : false);
    	}
}