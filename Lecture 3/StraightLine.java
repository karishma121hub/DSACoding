import java.util.Scanner;
class StraightLine {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int m1=(y2-y1)/(x2-x1);
        int m2=(y3-y2)/(x3-x1);
        if(m1==m2){
            System.out.println("its a straight line");

        }
        else{
            System.out.println("Its not a straight line");
        }

    }
    
  
}
