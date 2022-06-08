package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = {4,7,3,9,29,19,56,45,1};
        System.out.println("Number List Before Sorting :" + Arrays.toString(numArray) );
        insertionSort(numArray);
        System.out.println("Number List After Sorting :" + Arrays.toString(numArray) );
	}
	private static void insertionSort(int[] numArray) {
		// TODO Auto-generated method stub
		int size = numArray.length, i;
		for (i = 1; i < size; i++) {
            int key = numArray[i];
            int j = i - 1;
            
            while (j >= 0 && key < numArray[j]) {
            	numArray[j + 1] = numArray[j];
                --j;
            }
            numArray[j + 1] = key;
        }
    }
}