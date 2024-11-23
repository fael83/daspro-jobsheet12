import java.util.Scanner;
public class CinemaWithScanner13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String [4][2];
        while (true) {
            System.out.print("Enter a name: ");
            String name = sc.next();
            System.out.print("Enter row number: ");
            int row = sc.nextInt();
            System.out.print("Enter column number: ");
            int column = sc.nextInt();

            audience[row - 1][column - 1] = name;
            System.out.print("Are there any other audience to be added? (y/n): ");
            String next = sc.next();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}