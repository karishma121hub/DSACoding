// import java.util.Scanner;
// class Max2{
// public static void MaxMin(int a,int b, int c){
//     if(a>b && a>c){
//         System.out.print(a + " is greater");
//     }else if(b>a && b>c){
//         System.out.print(b + " is greater");
//     }else{
//         System.out.print(c + " is greater");
//     }
// }
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int c = sc.nextInt();

//     MaxMin(a,b,c);
//  }
// }

import java.util.Scanner;
class Max2{
public static String MaxMin(int a,int b, int c){
    if(a>b && a>c){
        return a + " is greater";
    }else if(b>a && b>c){
        return b + " is greater";
    }else{
        return c + " is greater";
    }
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String result= MaxMin(a,b,c);
    System.out.print(result);
 }
}

