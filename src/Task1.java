
public class Task1 {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        for (int f3 = 0; f3 <= 10_000_000; f3++) {
            f3 = f1 + f2;
            System.out.print(f3 + " " );
            f1 = f2;
            f2 = f3;
        }

    }
}