public class MergeSort {
	public static final int MAX_ARRAY_LEN = 2000;

	public static void main(String args[]) {
		int[] arr = { 5, 12, -98, 5 };
		

		mergeSort(arr, 0, arr.length - 1);
		printArr(arr);

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void mergeSort(int[] arr, int low, int high) {
		int middle;
		if (high - low > 0) {
			middle = (low + high) / 2;

			mergeSort(arr, low, middle);
			mergeSort(arr, middle + 1, high);
			merge(arr, low, middle, high);

		}

	}

	public static void merge(int[] arr, int low, int middle,
			int high) {
		int leftIndex = low;
		int rightIndex = middle + 1;
		int combinedIndex = low;
		int tempArray[] = new int[MAX_ARRAY_LEN];
		while (leftIndex <= middle && rightIndex <= high) {
			if (arr[leftIndex] <= arr[rightIndex]) {
				tempArray[combinedIndex++] = arr[leftIndex++];

			} else {
				tempArray[combinedIndex++] = arr[rightIndex++];

			}
		}
		if (leftIndex == middle + 1) {
			while (rightIndex <= high) {
				tempArray[combinedIndex++] = arr[rightIndex++];

			}
		} else {
			while (leftIndex <= middle) {
				tempArray[combinedIndex++] = arr[leftIndex++];

			}
		}

		for (int i = low; i <= high; i++) {
			arr[i] = tempArray[i];
		}
	}
}
