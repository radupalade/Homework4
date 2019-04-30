import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int row = 1; row <= size; row++) {
            for (int col = 0; col <= size - 1; col++) { //test size-1
                System.out.print("#" + " ");
            }
            System.out.println();
        }
    }

    //mai jos varianta cu while

   /* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int row = 1;

        while (row <= size) {
            int col = 1;

            System.out.print("#" + " ");
            while (col < size) {
                System.out.print("#" + " ");
                col++;

            }
            row++;
            System.out.println();


        }*/

}
