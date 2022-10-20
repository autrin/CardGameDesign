
public class Test {
	public static boolean whoKnows(int[] arr, int i, int j) {
		if (i >= j) {
			return true;
		} else {
			int mid = (i + j) / 2;
			boolean leftOk = whoKnows(arr, i, mid);
			boolean rightOk = whoKnows(arr, mid + 1, j);
			return leftOk && rightOk && arr[mid] <= arr[mid + 1];
		}
	}

	public static void main(String args[]) {
		int[] arr = { 1, 5, 2, 4, 7, 6, 8 };
		System.out.println(whoKnows(arr, 0, arr.length - 1));
	}
}
