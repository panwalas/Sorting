import java.util.Arrays; 

public class BubbleSortRec {
	static void bubbleSort(int arr[], int n) 
    { 

        if (n == 1) 
            return; 
 
        for (int i=0; i<n-1; i++) 
            if (arr[i] > arr[i+1]) 
            { 

                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
            } 
       
        bubbleSort(arr, n-1); 
    } 
       
    public static void main(String[] args) 
    { 
        int arr[] = {6, 4, 2, 1, 3, 5}; 
       
        bubbleSort(arr, arr.length); 
          
        System.out.println("Sorted array : "); 
        System.out.println(Arrays.toString(arr)); 
    } 

}
