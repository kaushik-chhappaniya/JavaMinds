package SearchingSorting;

import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */


public class SelectionSort {
	public static void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		{
			int min_index = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_index])
					min_index = j;
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String args[])
	{
        System.out.println("Enter size of array:");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
		int arr[] = new int[size];
        System.out.println("Enter an array:");
        for (int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
		sort(arr);
		System.out.println("Sorted array");
        for (int i=0; i<size; i++)
        {
			System.out.print(arr[i]+" ");
        }
		System.out.println();
	}
}
