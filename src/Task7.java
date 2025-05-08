import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scan.nextInt();
        for (int i = 31; i >= 0; i--) {
          int bit = (number >> i) & 1;
            System.out.print(bit);
        }
    }
}
