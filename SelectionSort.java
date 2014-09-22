public class SelectionSort {
	public static void selectionSort(Account[] arr) {

		int i, j, minIndex;
		Account tmp;
		int n = arr.length;

		for (i = 0; i < n - 1; i++) {

			minIndex = i;

			for (j = i + 1; j < n; j++) {

				if (arr[j].balance < arr[minIndex].balance) {
					minIndex = j;
				}
			}

			if (minIndex != i) {

				tmp = arr[i];

				arr[i] = arr[minIndex];

				arr[minIndex] = tmp;

			}

		}

	}

	public static void printArr(Account[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].userId+" "+arr[i].balance);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Account[] accounts = new Account[4];
		accounts[0]=new Account(1,17.80);
		accounts[1]=new Account(2,94.25);
		accounts[2]=new Account(3,800.63);
		accounts[3]=new Account(4,312.66);
		selectionSort(accounts);
		printArr(accounts);
	}
}
