import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scan.nextInt();
        int numL = (int) Math.log10(number) + 1;
        int oneNumber = number / (int) Math.pow(10, numL / 2);
        int twoNumber = number % (int) Math.pow(10, numL / 2);
        int numL1 = (int) Math.log10(oneNumber) + 1;
        int numL2 = (int) Math.log10(twoNumber) + 1;
        if (numL % 2 !=0 ) {
            oneNumber = oneNumber/ 10;
            numL1 = (int) Math.log10(oneNumber) + 1;
        }
        int twoNumber1 = 0;
        for (int i = numL1 - 1, t = 0; i >= 0 & t <= numL1 - 1; i--, t++) {
            int a = twoNumber % 10;

            twoNumber1 = twoNumber1 + a * (int) Math.pow(10, i);
            twoNumber = twoNumber / 10;

        }
        if (oneNumber == twoNumber1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
