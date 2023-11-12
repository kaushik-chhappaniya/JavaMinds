package SearchingSorting;

import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(arr.length <= 1)
            return ;
        int b[] = new int[arr.length/2];
        int c[] = new int[arr.length - b.length];
        for(int i = 0; i < arr.length/2; i++)
            b[i] = arr[i];
        for(int i = arr.length/2; i < arr.length; i++)
            c[i - arr.length/2] = arr[i];
        mergeSort(b, 0, b.length-1);
        mergeSort(c, b.length, c.length-1);
        merge(b, c, arr);
        
    }

    public static void merge(int[] b, int[] c, int[] input){
        int i = 0, j = 0, k = 0;
        while(i < b.length && j < c.length){
            if(b[i] < c[j]){
                input[k] = b[i];
                i++;
                k++;
            }
            else{
                input[k] = c[j];
                j++;
                k++;
            }
        }
        while(i < b.length){
            input[k] = b[i];
            k++;
            i++;
        }
        while(j < c.length){
            input[k] = c[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
		int arr[] = new int[size];
        System.out.println("Enter an array:");
        for (int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        mergeSort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
    }
}
}
