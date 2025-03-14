import java.util.*;

public class FindLargestnumber {

    public static void main(String[] args) {
        
        int arr1[] = {2, 5, 1, 3, 0};

        System.out.println("The Largest element in the array is: " + LargestNumber(arr1));
    }

    static int LargestNumber(int arr[]) {
        
        int max = Integer.MIN_VALUE; 
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { 
                max = arr[i];
            }
        }
        
        return max; 
    }
}
