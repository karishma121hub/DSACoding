import java.util.Scanner;
public class P8 {
    public static void triangle(int n){
        int space = n-1;
        int star =1;
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
            space--;
            star+=2;
            row++;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangle(n);
    }
    
}
