import java.util.*;
public class arr1 {
    public static void find(int[] arr, int target){
        
        for(int j = 0 ;j< arr.length ; j++){
            if( arr[j] == target){
                System.out.println("found"+j);
                
                return;
            }
        }
        System.out.println("not found");
       
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0 ; i< 5;i++){
             arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        find(arr, target);
    }
}