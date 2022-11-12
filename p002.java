public class p002 {
	public static void main(String[] args) {
		int sum = 2;
		int a = 1;
		int b = 2;
		while (b <= 4000000) {
			int temp = b;
			b += a;
			a = temp;
			if (b % 2 == 0) {
				sum += b;
			}
		}
		System.out.println(sum);
	}
}