
//   Using void
// import java.util.Scanner;
// class EvenOdd{
// public static void EvenOdd(int n){
//     if(n%2==0){
//         System.out.print("Even");
//     }else{
//         System.out.print("Odd");
//     }
// }
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     EvenOdd(n);
//  }
// }


// Using return function
import java.util.Scanner;
class EvenOdd{
    public static String EvenOdd(int n){
        if(n%2==0){
            return"Even";
        }else{
            return"Odd";
        }
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c =EvenOdd(n);
        System.out.print(c);
    }

}