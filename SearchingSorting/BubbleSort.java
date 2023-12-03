package SearchingSorting;

import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class BubbleSort {
    public static void bubbleSort(int arr[])
    {
        int i, j, temp, n = arr.length;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            if (swapped == false)
                break;
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
		bubbleSort(arr);
		System.out.println("Sorted array");
        for (int i=0; i<size; i++)
        {
			System.out.print(arr[i]+" ");
        }
		System.out.println();
	}
}
