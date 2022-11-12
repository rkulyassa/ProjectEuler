public class p004 {
	public static void main(String[] args) {
		int result = 0;
		for (int a = 100; a <= 999; a++) {
			for (int b = 100; b <= 999; b++) {
				boolean palindrome = true;
				String test = String.valueOf(a*b);
				for (int i = 0; i < test.length()/2; i++) {
					if (test.charAt(i) != test.charAt(test.length()-1-i)) {
						palindrome = false;
					}
				}
				if (palindrome) {
					if (a*b > result) {
						result = a*b;
					}
				}
			}
		}
		System.out.println(result);
	}
}