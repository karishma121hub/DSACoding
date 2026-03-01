import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        while(row <= n) {
            int col = 1;
            while(col <= row) {
                if(col == 1 || col == row) {
                    System.out.print(row + " ");
                } else {
                    System.out.print("0 ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
