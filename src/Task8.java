public class Task8 {
    public static void main(String[] args) {
        int i = 0;
        for (int h = 23; h>= 0; h --) {
            for (int m = 0; m <= 59; m++) {
                int h1 = h /10; // первая цифра часов
                int h2 = h % 10;
                int m1 = m /10;
                int m2 = m % 10; // вторая цифра минут, сравнить с h1
                if (h1 == m2 && h2 == m1) {
                    if (h >= 10 && m >= 10) {
                        System.out.println(h + " : " + m);
                    } else if (h < 10 && m >= 10) {
                        System.out.println("0" + h + " : " + m);
                    } else if (h >= 10 && m < 10) {
                        System.out.println(h + " : " + "0" + m);
                    } else {
                        System.out.println("0" + h + " : " + "0" + m);
                    }
                    i +=1;
                }
            }
        }
        System.out.println("Всего комбинаций - " + i);
    }
}