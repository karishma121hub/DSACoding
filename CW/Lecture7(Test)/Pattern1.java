import java.util.Scanner;
public class Pattern1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int row =1;
        while(row<=n){
            int num=1;
            while(num<=row){
                System.out.print(num);
                num++;
            }
            System.out.println();
            row++;
        }
    }
    
}
