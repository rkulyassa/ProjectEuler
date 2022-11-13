public class p012 {
	public static void main(String[] args) {
		int divisors = 0;
		int i = 1;
		int num = 0;
		int targetDivisors = 500;
		while (divisors <= targetDivisors) {
			num += i;
			i++;
			if (num % targetDivisors != 0) {
				continue;
			}
			divisors = 1;
			for (int j = 1; j <= num/2; j++) {
				if (num % j == 0) {
					divisors++;
				}
			}
		}
		System.out.println(num);
	}
}