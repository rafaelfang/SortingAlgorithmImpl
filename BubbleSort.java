public class BubbleSort {
	public static void bubbleSort(int[] A) {
		int temp;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length - 1 - i; j++) {
				if (A[j] > A[j + 1]) {
					temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 2, 4, 6 };
		printArr(arr);
		bubbleSort(arr);
		printArr(arr);
	}
}
