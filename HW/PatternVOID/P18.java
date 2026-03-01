import java.util.Scanner;
public class P18 {
    public static void triangle(int n){
        int star = n-1;
        int space =0;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k =1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }

        System.out.println();
        star --;
        space+=2;
        row ++;

        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangle(n);
    }
    
}