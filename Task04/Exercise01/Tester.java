public class Tester {
	public static void main(String[] args) {
		double a = 5.4;
		double b = 3;
		double c = 3;

		boolean msg = Same.compareNumbers(a, b, c);

		Printer.print(msg);
	}
}
