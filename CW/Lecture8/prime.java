// import java.util.Scanner;
// public class prime {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int prime = 1;
//         for(int i =2;i<=n-1;i++){
//             if(n%i==0){
//                 prime =0;
//                 break;
//         }
//     }
//         if(prime==1){
//            System.out.print(" Prime Number");
//         }else{
//            System.out.print("Not Prime Number");
//         }
// }
// }

import java.util.Scanner;
class prime{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    boolean prime = true;
    if(n<=1){
        prime = false;
    }else{
        for(int i =2;i<n;i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
    }
    if(prime){
        System.out.print("Prime Number");
    }else{
        System.out.print("Not Prime Number");
    }
}
}