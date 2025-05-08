public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1_000_000; i++) {
            int sum = 0;
            for (int n = 1; n < i ; n++) {
                if (i % n == 0) {
                    sum = sum + n;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}

