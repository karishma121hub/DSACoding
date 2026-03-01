// import java.util.Scanner;
// class Pattern1{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int row =1;
//         while(row<=n){
//             int star = 1;
//             while(star<=n){
//                 System.out.print("* ");
//                 star ++;
//             }
        
//         System.out.println();
//         row ++;
//         }
//     }
// }

import java.util.Scanner;
class P1{
    public static void box(int n){
        int row =1;
        while(row<=n){
            int star=1;
            while(star<=n){
                System.out.print("* ");
                star ++;
            }
            System.out.println();
            row ++;
        }
    }
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       box(n);
    }

    
}