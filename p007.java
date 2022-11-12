public class p007 {
	public static void main(String[] args) {
		int result = 0;
		int count = 1;
		int i = 3;
		while (count < 10001) {
			boolean prime = true;
			for (int j = 2; j < Math.sqrt(i)+1; j++) {
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime) {
				count++;
				result = i;
			}
			i++;
		}
		System.out.println(result);
	}
}