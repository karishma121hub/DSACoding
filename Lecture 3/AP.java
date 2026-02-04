import java.util.Scanner;

class AP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter d: ");
        int d = sc.nextInt();

        for (int n = 1; n <= 5; n++) {
            int term = a + (n - 1) * d;
            System.out.println(term);
        }
    }
}
