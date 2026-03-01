import java.util.Scanner;
class Grade {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Grade A");
        }
        if(marks>=80){
            System.out.println("Grade B");
        }
        if(marks>=60){
            System.out.println("Grade C");
        }
        else{
             System.out.println("Grade F");
        }
    }
    
}
