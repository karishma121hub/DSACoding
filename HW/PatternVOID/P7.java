import java.util.Scanner;
public class P7 {
    public static void BoxMiddleSpace(int n){
        int row =1;
        while(row<=n){
            int col =1 ;
            while(col<=n){
                if(row==1||row==n||col==1||col==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                col++;
            }
        System.out.println();
        row++;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BoxMiddleSpace(n);
    }
    
}
