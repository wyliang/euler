import java.util.Scanner;


public class LargestPrimeFactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long input;
		input = scanner.nextLong();
		for(int i = (int) Math.ceil(Math.sqrt(input)); i > 0; i--) {
			if(input % i == 0 && isPrime(i)) {
				System.out.println(i);
			}
		}
		scanner.close();
	}

	private static boolean isPrime(int num) {
		if(num == 2) {
			return true;
		}

		for(int i = 2; i <= (int) Math.ceil(Math.sqrt(num)); i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}



}
