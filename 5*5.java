
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(j);
            }
            for (int k = 0; k < i; k++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}