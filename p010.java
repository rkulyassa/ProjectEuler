public class p010 {
	public static void main(String[] args) {
		long result = 1;
		for (int i = 1; i < 2000000; i += 2) {
			boolean prime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime) {
				result += i;
			}
		}
		System.out.println(result);
	}
}