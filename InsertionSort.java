
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 1; i < a.length; i++) {
			int value = a[i];
			int tempIndex = i;
			while (tempIndex > 0 && value < a[tempIndex - 1]) {
				a[tempIndex] = a[tempIndex - 1];
				tempIndex = tempIndex - 1;
			}
			a[tempIndex] = value;
		}
	}

}
