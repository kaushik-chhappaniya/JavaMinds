package SearchingSorting;

import java.util.Scanner;

public class InserationSort {
    public static void insetionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
        insetionSort(arr);
        System.out.println("Sorted array");
        for (int i=0; i<size; i++)
        {
			System.out.print(arr[i]+" ");
        }
		System.out.println();
	}
}
