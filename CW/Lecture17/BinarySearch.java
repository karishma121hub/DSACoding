import java.util.*;
public class BinarySearch {
    public static void find(int[] arr,int target){
       int s =0;
       int n = arr.length-1;
       while(s<=n){
        int mid = (s+n)/2;
        if(arr[mid]==target){
           System.out.print("Element found at index: " + mid);
           break;
        }else if(arr[mid]>target){
            n = mid-1;
        }else{
            s=mid+1;
        }
        
    }
    if(s>n){
        System.out.print("Not Found");
    }
}   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        find(arr,target);
    }
}

