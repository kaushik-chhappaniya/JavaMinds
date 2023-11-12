package SearchingSorting;

import java.util.Scanner;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */

public class QuickSort {
    
    static Scanner s = new Scanner(System.in);
    public static void quickSort(int[] input){
		quickSort(input ,0, input.length-1);
	}

	public static void quickSort(int[] input ,int startIndex, int endIndex) {
		if(startIndex >= endIndex ){
			return;
		}
		int pivot = pivotIndex(input, startIndex, endIndex);
		quickSort(input, startIndex, pivot-1);
		quickSort(input, pivot+1, endIndex);

	}

	public static int pivotIndex(int[] arr, int si,int ei){
		int smallerNumCount = 0;
		int pivot = arr[si];
			for(int i = si+1 ; i <= ei; i++ ){
				if(arr[i] <= pivot){
					smallerNumCount++;
				}
			}
			int pivotIndex = si+ smallerNumCount;
			arr[si] = arr[pivotIndex];
			arr[pivotIndex] = pivot;
			int i = si, j = ei;
			while(i<j){
				while(i <= ei && arr[i] <= pivot)
					i++;
				while(arr[j] > pivot)
					j--;
				if( i<= j){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
			}
			return pivotIndex;
	}

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        quickSort(input, 0, input.length - 1);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
