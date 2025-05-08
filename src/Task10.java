public class Task10 {
    public static void main(String[] args) {
        int nok = 20;
        two:for (int number = 19; number >= 2; number--) {
            int w = number;
            two1: for (int d = 2; d <= number; d++) {
                if (w % d == 0 && nok % w != 0) {
                    while (w % d == 0 && nok % number != 0 && nok % d == 0) {
                        w = w / d;
                        nok = nok / d;}
                    continue  two1;
                } else if (nok % number == 0) {
                    continue two;
                }
                nok = nok * number;
            }

        }
        System.out.println(nok);
    }
}
