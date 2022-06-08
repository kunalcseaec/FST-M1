package activities;

import java.util.Arrays;

public class Activity2 {

 
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int[] x = {10, 77, 10, 54, -11, 10};
		System.out.println("Number List: " + Arrays.toString(x));
		
		int Num1 = 10;
		int finalNum = 30;
		boolean finalResult = result(x, Num1, finalNum);
		System.out.println("Result: " + finalResult);
	}

	private static boolean result(int[] x, int num1, int finalNum) {
		// TODO Auto-generated method stub
		int initialSum = 0;
		for (int number : x) {
            
            if (number == num1) {
               
            	initialSum += num1;
            }

            if (initialSum > finalNum) {
                break;
            }
        }
        return initialSum == finalNum;
    }
}
		
