package com.company;

import java.util.Random;

public class System_2 {

    public static void main(String[] args) {
        int[] numbers = new int[1000];
        Random random = new Random();

        for(int i = 0;i < numbers.length;i++){
            numbers[i] = random.nextInt(10000);
        }

        int min = 0;
        int min_3 = 0;
        int min_7 = 0;
        int min_21 = 0;
        for (int number : numbers) {
            if (number > min) {
                min = number;
            }
            else if ((number % 3 == 0) && (number > min_3)) {
                min_3 = number;
            }
            else if ((number % 7 == 0) && (number > min_7)) {
                min_7 = number;
            }
            else if ((number % 21 == 0) && (number > min_21)) {
                min_21 = number;
            }
        }
        int product_min = min * min_21;
        int product_min_2 = min_3 * min_7;
        if (product_min * product_min_2 == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(Math.max(product_min, product_min_2));
        }
    }
}