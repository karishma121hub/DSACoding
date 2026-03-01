import java.util.*;
public class Reverse {
    public static void ReverseArray(int[]arr){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[i]=arr[temp];
            i++;
            j--;
        }
        System.out.println("Reversed Array: ");
        int k =0;
        while(k<arr.length){
            System.out.print(arr[k]+ " ");
            k++;
        }
    }
    
}
