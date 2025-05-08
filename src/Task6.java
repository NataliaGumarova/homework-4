public class Task6 {
    public static void main(String[] args) {
        int j = 0;
        two: for (int number = 10_000_000; number <= 99_999_999; number++) {
            if (number % 12345 == 0) {
                //System.out.println(number);
                int a = number / 10_000_000;
                int h = number % 10;
                if (a == h) {
                    continue two;
                }
                int gs = number / 10;
                int g = gs % 10;
                if (g == a || g == h) {
                    continue two;}
                int fs = gs / 10;
                int f = fs % 10;
                if (f == a || f == h || f == g) {
                    continue two;
                }
                int es = fs / 10;
                int e = es % 10;
                if (e == a || e == h || e == g || e == f) {
                    continue two;
                }
                int ds = es / 10;
                int d = ds % 10;
                if (d == a || d == h || d == g || d == f || d == e) {
                    continue two;
                }
                int cs = ds / 10;
                int c = cs % 10;
                if (c == a || c == h || c == g || c == f || c == e || c == d) {
                    continue two;
                }
                int bs = cs / 10;
                int b = bs % 10;
                if (b == a ||b == h || b == g || b == f || b == e || b == d || b == c) {
                    continue two;
                } else {
                    System.out.println(number);
                    j +=1;
                }

            }
        }
        System.out.println("Итого " + j + " чисел");
    }
}
