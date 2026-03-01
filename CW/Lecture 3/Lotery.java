import java.util.Scanner;
class Lotery {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int n =sc.nextInt();
        if(n>=300 && n<=460){
            System.out.println("Prize is MacBook");
        }
        else if(n>=200 && n<=280){
            System.out.println("Prize is Kurkure");
        }
        else if(n>=1100 && n<=150){
            System.out.println("Prize is Cycle");
        }
        else if(n>50 && n<=80){
            System.out.println("Prize is MacBook");
        }
        else{
            System.out.println("Better luck next time");
        }
    }

    
}
