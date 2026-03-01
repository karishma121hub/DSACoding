import java.util.Scanner;
public class P17 {
    public static void triangle(int n){
        int space = n-1;
        int num=1;
        int row =1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j =1;
            while(j<=num){
                System.out.print(row);
                j++;
            }
            System.out.println();
            num+=2;
            space --;
            row++;

        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangle(n);
    }
    
}
