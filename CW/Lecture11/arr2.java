import java.util.*;

public class arr2 {

    public static void find(int[] arr, int target){
        boolean found = false;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == target){
                System.out.println(i);
                found = true;
                break;
            }
        }

        if(found == false){
            System.out.println("number not found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        find(arr, target);
    }
}