
// import java.util.Scanner;
// class Max{
// public static void MaxMin(int a,int b){
//     if(a>b){
//         System.out.print(a + "is greater");
//     }else{
//         System.out.print(b + "is greater");
//     }
// }
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     MaxMin(a,b);
//  }
// }

import java.util.Scanner;
class Max{
    public static String MaxMin(int a , int b){
        if(a>b){
            return "a is greater";
        }else{
            return "b is greater";
        }
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c =MaxMin(a,b);
        System.out.print(c);
    }

}