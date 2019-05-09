import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int row = 1; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("#");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

            //nu functioneaza corect


        }
        for (int row = 1; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("#");

                } else {
                    System.out.print(" ");
                }

            }

        }
    }
}