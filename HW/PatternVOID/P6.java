import java.util.Scanner;
class P6{
    public static void bendRight(int n){
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
            space +=2;
            star --;
            row++;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bendRight(n);
    }
}