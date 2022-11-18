package homeWork1;

import java.util.Random;

public class ClassLesson3 {

    public static void main(String[] args) {
        int[] mass = new int[20];
        int value = -8;
        for (int i=0; i<mass.length; i++){
            mass[i]=value;
            value+=5;
            System.out.println(mass[i]);
        }



        int sum = 0;
        for (int t : mass) {
            if (t > 5 & t < 45) {
                sum += t;
            }
        }
        System.out.println("Sum result: " + sum);

        for (int t:mass) {
            if (t % 2 == 0 && t>0){
                System.out.println("Chet: " +t);
            }
        }

    }


}

