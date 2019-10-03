package mathProblems;

public class MathEquationForLoop {


	public static void main(String[] args) {
		equationSolverFor();
		equationSolverWhile();
	}

	private static void equationSolverWhile() {
		int x = 0;
		while (x < 11) {
			int result = 3 * x;
			System.out.println("3 * " + x + " = " + result);
			x++;
		}
		
	}

	private static void equationSolverFor() {
		
		for(int i = 0; i < 11; i++) {
			int result = 3 * i;
			System.out.println("3 * " + i + " = " + result);
		}
		
	}
}
