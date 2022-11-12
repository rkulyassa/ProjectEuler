public class p005 {
	public static void main(String[] args) {
		int range = 20;
		int result = 0;
		int i = range*range;
		while (result == 0) {
			boolean found = true;
			for (int j = 2; j <= range; j++) {
				if (i % j != 0) {
					found = false;
				}
			}
			if (found) {
				result = i;
			} else {
				i += range;
			}
		}
		System.out.println(result);
	}
}