package homeWork1;

public class Util {

    public static void main(String[] args) {

        int[] mass = new int[20];
        int value = -8;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = value;
            value += 5;
            System.out.println(mass[i]);
        }
        printSomeText("Ilona");


        int sum = 0;
        for (int t : mass) {
            if (t > 5 & t < 45) {
                sum += t;


            }
        }
        System.out.println("Sum result: " + sum);
        int m = sumNumber(sum, 10);
        printSomeText(String.valueOf(m));

        for (int t : mass) {
            if (t % 2 == 0 && t > 0) {
                System.out.println("Chet: " + t);
            }
        }

    }


    private static void printSomeText(String str) {
        System.out.println(str);
    }

    private static int sumNumber(int numb1, int numb2) {
        int result;
        result = numb1 + numb2;
        return result;
    }

    public static int devide(int t, int i) {
        if (checkNumber(i)) {
            return t / i;

        } else {
            System.out.println("Error / by zero");
            System.exit(0);
        }
        return t = 0;
    }


    private static boolean checkNumber(int i) {
        return i != 0;
    }


}

