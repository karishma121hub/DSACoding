import java.util.*;
public class Pivot {
    public static void find(int[] arr){
        int n = arr.length;
        for(int i =1;i<n-2;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.print(i);
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i =0;i<5;i++){
         arr[i]=sc.nextInt();
        }
        find(arr);

    }
    
}
