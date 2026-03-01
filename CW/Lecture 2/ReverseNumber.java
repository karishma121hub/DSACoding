import java.util.Scanner;
class ReverseNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a =0;
        while(a>0){
            int r =n%10;
            n=n/10;
            a=a*10+r;
        }
        System.out.println(a);

    }
    
}
