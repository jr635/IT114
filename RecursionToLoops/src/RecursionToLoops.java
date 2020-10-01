public class RecursionToLoops {
	public static int sum(int num) {
		for (int i = 0; i < num; i++) {
			return num + sum(num - 1);
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(sum(10));
	}
}