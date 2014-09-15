public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 4, 7 };

		printArr(arr);
		quickSort(arr, 0, arr.length - 1);
		printArr(arr);
	}

	private static void quickSort(int[] arr, int low, int high) {
		int middle = (low + high) / 2;
		int pivot = arr[middle];

		int i = low;
		int j = high;

		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
		}
		if (low < j) {
			quickSort(arr, low, j);
		}
		if (high > i) {
			quickSort(arr, i, high);
		}

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
