import java.util.Scanner;
public class Pattern4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =1;
        while(row<=n){
            int num=1;
            while(num<=n){
                if(num==n-row+1){
                    System.out.print("*");
                }else{
                    System.out.print(n-num+1);
                }
                
                num++;
            }
            System.out.println();
            row++;
        }
    }
    
}
