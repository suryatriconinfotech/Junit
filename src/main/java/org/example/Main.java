package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder inputBuilder = new StringBuilder();
        String line;
        while (!(line = s.nextLine()).isEmpty()) {
            inputBuilder.append(line).append("\n");
        }
        String a = inputBuilder.toString().trim();
        try {
            System.out.print(Calculator.add(a));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}