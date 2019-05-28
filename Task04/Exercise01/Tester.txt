public class Tester {
	public static void main(String[] args) {
		double a = 5.4;
		double b = 3;
		double c = 3;

		boolean msgEqual = Same.compareEqualNumbers(a, b, c);
		boolean msgUnequal = Same.compareUnequalNumbers(a, b, c);

		Printer.print(msgEqual);
		Printer.print(msgUnequal);
	}
}