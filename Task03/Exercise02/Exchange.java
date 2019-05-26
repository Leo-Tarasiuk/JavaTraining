public class Exchange {
	public static void swapNumbers(double a, double b) {
		a += b;
		b = a - b;
		a -= b;
		
		Printer.print(a, b);
	}
}
