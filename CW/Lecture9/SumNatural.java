// import java.util.Scanner;
// public class SumNatural {
//     public static void Sum(int n){
//     int sum =n*(n+1)/2;
//         System.out.print(sum);
        
// }
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Sum(n);
 
//     }
// }


import java.util.Scanner;
public class SumNatural {
    public static int Sum( int n){
        return n*(n+1)/2;
        
}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Sum(n));
 
    }
}


