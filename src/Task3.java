public class Task3 {
    public static void main(String[] args) {
        for (int number = 10; number <= 1_000_000; number++) {
            int n = number;
            int c = 0;
            int numL = (int)Math.log10(number);
            for (int i = numL; i > 0; i--) {
                int a = n / (int) Math.pow(10, i);
                int b = n % (int) Math.pow(10, i);
                c = c + (int) Math.pow(a, numL + 1);
                if((int)Math.log10(b) < i - 1 && (int)Math.log10(b)+1 >= 1) //проверяем что остаток не начинается на 0
                {
                    i = (int)Math.log10(b) + 1; // если остаток начинается на 0, сокращаем кол-во итераций на к-во нулей в начале
                }
                if (b >= 10) {
                    n = b;
                } else {
                    c = c + (int) Math.pow(b,numL + 1);
                }
            }
            if (c == number) {
                System.out.println(number);
            }

        }
    }
}