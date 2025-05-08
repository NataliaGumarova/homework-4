public class Task2 {
    public static void main(String[] args) {
        boolean b = true;
        for (int p = 2; p <= 1_000_000; p++) {
            for (int i = 2; i < Math.sqrt(p); i++) {
                if (p % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(p);
            }else {
                b = true;
            }
        }

    }
}
