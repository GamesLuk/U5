package h2;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class H2_main {

    public static void main(String[] args) {

        int n = RandomGenerator.getDefault().nextInt(1,100_000_000);
        int digits;
        int[] a = new int[9];

        System.out.println("n = " + n);

        String[] b = new String[9];
        String str_n = n + "";
        digits = str_n.length();

        System.out.println("digits = " + digits);

        for (int i = 0; i < str_n.length(); i++) {
            b = str_n.split("");
        }

        System.out.println("b = " + Arrays.toString(b));

        for (int a_index = 8, b_index = 8; a_index >= 0; b_index--) {

            if(b_index < 0) {
                a[a_index] = 0;
                a_index--;
                continue;
            }

            if(b.length > b_index) {
                a[a_index] = Integer.parseInt(b[b_index]);
                a_index--;
            }

        }

        System.out.println("a = " + Arrays.toString(a));

    }

}
