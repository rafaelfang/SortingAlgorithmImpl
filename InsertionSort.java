public class InsertionSort {
	//insertion sort
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 4, 7 };
		printArr(arr);
		insertionSort(arr);
		printArr(arr);
	}

	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > current) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = current;
		}

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
