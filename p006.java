public class p006 {
	public static void main(String[] args) {
		int result = 0;
		int count = 100;
		int a = 0;
		int b = 0;
		for (int i = 1; i <= count; i++) {
			a += i*i;
		}
		for (int i = 1; i <= count; i++) {
			b += i;
		}
		b *= b;
		result = b-a
		System.out.println(result);
	}
}
