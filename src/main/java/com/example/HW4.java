package com.example;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if(str.length()==0){
                throw new RuntimeException("Пустые строки вводить нельзя");
            }
        }
    }
}
