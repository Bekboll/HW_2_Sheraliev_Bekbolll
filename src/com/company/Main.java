package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(ageTemp(30, 24));
        System.out.println(ageTemp(50, 23));
        System.out.println(ageTemp(20, 22));
        System.out.println(ageTemp(60, 21));
        System.out.println(ageTemp(40, 20));
        System.out.println(generateRandomAge()+" "+ageTemp(generateRandomAge() , 20));
    }
    public static String ageTemp(int age , int temp) {
        String human1 = "Можно идти гулять \uD83D\uDEB6"; // \uD83D\uDEB6 -Эмоджи можно идти гулять)
        String human3 = "Оставайтесь дома \uD83C\uDFE0"; // \uD83C\uDFEO -Эмоджи ставайтесь дома)

        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30 ) {
            return human1;
        }else if (age < 20 && temp >= 0 && temp <= 28 ) {
            return human1;
        }else {
            return human3;
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int x = random.nextInt(20);
        return x;
    }
}