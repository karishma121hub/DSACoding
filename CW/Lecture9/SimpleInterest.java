// import java.util.Scanner;
// class SimpleInterest{
// public static void SI(int p, int r,int t){
//     int n= (p*r*t)/100;
//     System.out.print(n);
//  }
//  public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     int p = sc.nextInt();
//     int r = sc.nextInt();
//     int t = sc.nextInt();
//     SI(p,r,t);
//  }
// }

import java.util.Scanner;
class SimpleInterest{
public static int SI(int p, int r,int t){
    int n= (p*r*t)/100;
    return n;
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int r = sc.nextInt();
    int t = sc.nextInt();
    int result = SI(p,r,t);
    System.out.print(result);
}
}