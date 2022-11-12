public class p003 {
	public static void main(String[] args) {
		long result = 0;
		long n = 600851475143L;
		for (long i = 3; i < Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				boolean isPrime = true;
				for (long a = 2; a < i; a++) {
					if (i % a == 0) {
						isPrime = false;
					}
				}
				if (isPrime) {
					result = i;
				}
			}
		}
		System.out.println(result);
	}
}