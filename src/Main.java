import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] a = {5.5, 7.1, 2.4, 4.5, -5.1, 16.2, 8.3, 11.1, -12.2, 8.8, -13.2, 1.2, -4.3, 16.3, 4.4};
        double b = 0;
        int c = 0;
        boolean proverka = false;
        for (double e : a) {
            if (e < 0) {
                proverka = true;

            } else if (e > 0 && proverka) {
                b += e;
                c++;
                System.out.println(e);
            }


        }
        System.out.println("общее орифметическое число" + b / c);
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    double t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }


            }}
        System.out.println(Arrays.toString(a));

    }
}




