import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пробег");
        int way = scan.nextInt();
        int day = 1;
        double x = 5;
        while (x < way) {
            x = 1.1 * x;
            day +=1;
        }
        System.out.println(day);


    }
}
