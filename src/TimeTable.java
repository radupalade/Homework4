import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        System.out.print("*" + "\t|");

        for (int x = 1; x <= size; x++) {
            System.out.print(x + "\t");
        }
        System.out.println();
        System.out.println("------------------------------------------");


        for (int i = 1; i <= size; i++) {

            System.out.print(i + "\t|");

            for (int j = 1; j <= size; j++) {
                System.out.print((i * j) + "\t");
                if (j == size) {
                    System.out.println();
                }

            }
        }
        System.out.println();
    }
}
