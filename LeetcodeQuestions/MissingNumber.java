import java.util.*;
class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int FormulaSum= n*(n+1)/2;
        int TotalSum= 0;
        for(int i =0;i<n;i++){
            TotalSum = TotalSum+ nums[i];
        }
        int missing= FormulaSum-TotalSum;
        return missing;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int result = missingNumber(arr);
        System.out.print("The missing number is: " + result);

    }

}
