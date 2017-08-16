package pl.sda.loops;

public class ForLoop {

	public static void main(String[] args) {

		for (int a = 1, b = 2; a < 10 || b < 5; a++, b++) {
			// sk³adnia:(instr. przed wej ; do kiedy ma wyk. ;ins.na wyj)
			// np. (int a = 1 ; a<10 ; a++)
			System.out.println(a + ", " + b);
		}
	}

}
