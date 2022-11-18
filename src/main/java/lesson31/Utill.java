package lesson31;

import java.util.Random;

public class Utill {

    public static int sum1(int[] mass) {
        int sum = 0;
        for (int t : mass) {
            if (t > 5 & t < 45) {
                sum += t;
            }
        }
        return sum;
    }

    public static void chet222(int[] args) {

        for (int number : args) {
            if (number % 2 == 0 && number > 0) {
                System.out.println(number);

            }
        }

    }

    public static void m2(int[] maasss) {
        for (int i = 0; i < maasss.length; i += 2) {
            System.out.println(maasss[i]);
        }


    }

    public static int[] createM(int i) {
        int[] n = new int[i];
        Random rand = new Random();

        for (int y = 0; y < n.length; y++) {
            n[y] = rand.nextInt(50);
        }

        return n;
    }
}













