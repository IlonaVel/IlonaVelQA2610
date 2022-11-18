package lesson31;

public class Lesson31 {
    public static String main(String[] args) {
        String str = "456";
        int number = Integer.parseInt(str);
        number += 10;
        System.out.println(number);
        return str;
    }

    public static String someMethd(int numb){
        String str = "Not ok";

        return numb>5? "ok": str;
    }


    }




