package org.example;

public class Calculator {
    public static int add(String a)  {
        if(a.isEmpty())return 0;
        String[] ch=a.split("[,\n]");
        int[] numbers=new int[ch.length];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=Integer.parseInt(ch[i].trim());
        }
        if(numbers.length==0)return 0;
        int sum=0;
            for (int number : numbers) {
                if (number < 0) {
                   throw new IllegalArgumentException("Negative numbers not allowed");
                }
                else if(number<=1000){
                    sum += number;
                }
            }
        return sum;
    }
}
