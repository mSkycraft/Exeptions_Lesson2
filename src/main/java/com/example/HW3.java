
package com.example;

import java.io.FileNotFoundException;

/**
 * Hello world!
 */
public final class HW3 {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
     }
     public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
     }
}


