package nuliai;

public class nuliai {

	public static void main(String[] args) {
		// nuliaiPirmas();
		// nuliaiAntras();
		// nuliaiTrecias();
		// nuliaiKetvirtas();
		// nuliaiPenktas();
		// nuliaiSestas();
		//nuliaiSeptintas();
		nuliaiAstuntas();
	}

	private static void nuliaiAstuntas() {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(j + i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static void nuliaiSeptintas() {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.print(" " + i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static void nuliaiSestas() {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if ((j == 1) || (j == 10) || (i == 1))
					System.out.print("1 ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void nuliaiPenktas() {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if ((j % 2 != 0) || (i == 1))
					System.out.print("1 ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void nuliaiKetvirtas() {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if (i % 2 != 0)
					System.out.print("1 ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void nuliaiTrecias() {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if ((i + j == 11) || (i == j))
					System.out.print("1 ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void nuliaiAntras() {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if (i == j)
					System.out.print("1 ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void nuliaiPirmas() {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
