
public class EvenFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long p = 2, pp = 1, c = 0; 
		long evenSum = p;
		while(true) {
			c = p + pp;
			pp = p;
			p = c;
			if(p > 4000000)
				break;
			if(p % 2 == 0)
				evenSum += p;
		}
		System.out.println("sum : " + evenSum);
	}
}
