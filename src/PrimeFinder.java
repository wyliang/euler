import java.util.ArrayList;
import java.util.List;


public class PrimeFinder {

	private ArrayList<Integer> primes = new ArrayList<Integer>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		PrimeFinder finder = new PrimeFinder();
//		List<Integer> list = finder.find(100008);
//		System.out.println(list.get(list.size()-1));
		System.out.println(f(f(-1)));
	}
	
	public static int f(int x) {
		if(x > 0) {
			return -x;
		}
		else {
			return x;
		}
	}
	
	public ArrayList<Integer> find(int count) {
		int num = 2, i = 0;
		primes.add(2);
		count--; // 2 is already one of them
		while(count > 0) {
			num = ++i * 2 + 1;
			if(isPrime(num)) {
				primes.add(num);
				count--;
			}
		}
		return primes;
	}
	
	
	public boolean isPrime(int num)
	{
		for(int prime : primes) {
			if(prime > Math.ceil(Math.sqrt(num)))
				return true;
			if(num % prime == 0)
				return false;
		}
		return true;
	}

}
