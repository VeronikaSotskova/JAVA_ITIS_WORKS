import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int n = 0;

		a = scanner.nextInt();

		while (a != -999) {
			if (a % 10 == 6) {
				n = n + 1;
			}
			a = scanner.nextInt();
		}

		System.out.println("Chislo chisel na 6:" + n);

	}
}