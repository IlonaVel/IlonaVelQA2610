package lesson31;

import java.util.Arrays;

public class Lesson32 {
    public static void main(String[] args) {
       int[] massS = Utill.createM(20);
        System.out.println(Arrays.toString(massS));
        Utill.chet222(massS);
        System.out.println("Summa " + Utill.sum1(massS));
        Utill.m2(massS);
        Utill.createM(20);


        System.out.println(Lesson31.someMethd(2));


    }
}
