public class Loops {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		while (true) // I'm assuming you wanted an endless loop {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					System.out.println(arr[i]);
				}
				// Basically the loop is going through the array and checking if the value
				// stored in that
				// part of the array and doing that number modules 2 and if the output of that
				// is 0 then we know it is an even number
			}
	}

}