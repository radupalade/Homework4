import java.util.Scanner;

public class Simple {
    public static void getNumberOfDigits() {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = Integer.toString(n);
        System.out.println(str.length());

    }

    public static void main(String[] args) {
        getNumberOfDigits();
    }
}
