package com.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class HW1 {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        enternum();
    }

    public static void enternum(){
        
        while(true){
            System.out.print("Введите число - ");
            float fl;
            try{
                Scanner scanner = new Scanner(System.in);
                fl = scanner.nextFloat();
                System.out.println(fl);
            } catch (Exception e){

            }
            
        }
    }
}
