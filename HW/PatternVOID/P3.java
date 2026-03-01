import java.util.Scanner;
class P3{
    public static void reverseP2(int n){
        int row =1;
        while(row<=n){
            int star =n;
            while(star>=row){
                System.out.print("* ");
                star --;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseP2(n);
    }
}