
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		System.out.println(p.largestProductPalindrome(999));
	}
	
	public int largestProductPalindrome(int num) {
		int max = 0;
		for(int i = num; i > 0; i--) {
			for(int j = num; j > 0; j--) {
				if(isPalindrome(i*j)) {
					if(i*j > max) {
						max = i*j;
					}
				}
			}
		}
		return max;
	}
	
	public boolean isPalindrome(int num) {
		String str = String.valueOf(num);
		if(str.length() == 1) 
			return true;
		
		for(int i = 0, k = str.length()-1; ; i++, k--) {
			if(str.charAt(i) != str.charAt(k)) 
				return false;
			
			if(str.length() % 2 != 0) {
				if(i == k)
					break;
			} else {
				if(i+1 == k)
					break;
			}
		}
		return true;
	}

}
