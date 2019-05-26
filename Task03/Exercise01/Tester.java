public class Tester {
	public static void main(String[] args) {
		double m = 150;
	
		double convert_m = Money.convertBYRtoUSD(m);
		Printer.print(convert_m);

		convert_m = Money.convertBYRtoEUR(m);
		Printer.print(convert_m);

		convert_m = Money.convertUSDtoBYR(m);
		Printer.print(convert_m);

		convert_m = Money.convertEURtoBYR(m);
		Printer.print(convert_m);
	}
}
