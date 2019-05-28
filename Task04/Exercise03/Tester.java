public class Tester {
	public static void main(String[] args) {
		int a = 1357;

		boolean incrflag = NumericSequence.checkIncreaseSequence(a);
		boolean decrflag = NumericSequence.checkDecreaseSequence(a);

		Printer.print(incrflag);
		Printer.print(decrflag);
	}
}