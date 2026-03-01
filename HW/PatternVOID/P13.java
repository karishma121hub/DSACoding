import java.util.Scanner;
class P13{
    public static void sidetriangle(int n){
        int star =1;
        int row =1;
        while(row<=2*n-1){
            int i =1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            if(row<n){
                star++;
            }else{
                star--;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sidetriangle(n);
    }
}