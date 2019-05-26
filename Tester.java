public class Tester {
	public static void main(String[] args) {
		double weight = 367.14;

		double weight_on_mg = Interpreter.converceKgtoMg(weight);
		Printer.print(weight_on_mg);
	
		double weight_on_gr = Interpreter.converceKgtoGr(weight);
		Printer.print(weight_on_gr);

		double weight_on_ton = Interpreter.converceKgtoTon(weight);
		Printer.print(weight_on_ton);
	}
}