import java.util.Scanner;
 class Pattern3 {
    
    //i = rows and j = stars or spaces.
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt() ;
        int i=1;
        while(i<=n){
            int j=n;
            while(j>=i){
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;

        }
    }
}
    

