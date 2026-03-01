import java.util.*;
public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int start =0;
        int end= nums.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return end;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int result = findPeakElement(arr);
        System.out.print("The peak element is: " + result);

    }
}
    
