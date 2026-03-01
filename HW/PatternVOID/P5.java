import java.util.Scanner;
class P5{
    public static void ReverseP4(int n){
        int space = 0;
        int star =n;
        int row =1;
        while(row<=n){
            int i =1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j =1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            space ++;
            star --;
            row++;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReverseP4(n);
    }
}