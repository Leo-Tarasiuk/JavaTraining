public class Tester {
	public static void main(String[] args) {
		int a = 350120;

		double mid_arith = AverageValue.calcArithmeticAvarage(a);
		double mid_geometr = AverageValue.calcGeometricAvarage(a);

		Printer.print(mid_arith);
		Printer.print(mid_geometr);
	}
}
