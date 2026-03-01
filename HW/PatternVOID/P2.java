// import java.util.Scanner;
// public class P2 {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int row =1;
//         while(row<=n){
//             int star =1;
//             while(star<=row){
//                 System.out.print("* ");
//                 star++;
//             }
        
//         System.out.println();
//         row++;
//         }
//     }
    
// }


import java.util.Scanner;
public class P2 {
    public static void LeftPyramid(int n){
        
        int row =1;
        while(row<=n){
            int star =1;
            while(star<=row){
                System.out.print("* ");
                star++;
            }
        
        System.out.println();
        row++;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LeftPyramid(n);
    }
    
}