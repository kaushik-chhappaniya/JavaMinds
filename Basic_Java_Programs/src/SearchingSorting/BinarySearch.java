package SearchingSorting;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class BinarySearch {
	public static int binarySearch(int arr[], int l, int r, int x)
	{
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == x) {
				return mid;

			} else if (arr[mid] > x) {
				r = mid - 1;
			} else {
			l = mid + 1;
			} 
		}

		return -1;
	}

	public static void main(String args[])
	{
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = binarySearch(arr, 0, n - 1, x);

		if (result == -1)
			System.out.println("Element is absent");
		else
			System.out.println("Element found at the index: "
							+ result);
	}
}
