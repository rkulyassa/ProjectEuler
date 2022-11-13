public class p014 {
	public static void main(String[] args) {
		int result = 0;
		int longestLength = 0;
		for (int i = 1; i < 1000000; i++) {
			int length = 1;
			long n = i;
			while (n != 1) {
				if (n % 2 != 0) {
					n *= 3;
					n++;
				} else {
					n /= 2;
				}
				length++;
			}
			if (length > longestLength) {
				longestLength = length;
				result = i;
			}
		}
		System.out.println(result);
	}
}