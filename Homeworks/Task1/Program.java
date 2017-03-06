import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int sum = 0;
		int pr = 1;

		a = scanner.nextInt();

		while (a != -999) {
			if (a % 2 == 0) {
				sum = sum + a;
			}
			else { pr = pr * a;}
			a = scanner.nextInt();
		}

		System.out.println("Summa:" + sum);
		System.out.println("Proizvedenie:" + pr);

	}
}