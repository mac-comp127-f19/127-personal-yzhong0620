package basicjava;

import java.util.Scanner;

public class TimeConverter {
    public static int TimeConverter(int a,int b,int c){
        int sec;
        sec = a*60*60+b*60+c;
        return sec;
    }

    public static void main (String[] args){
        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        TimeConverter(num1, num2, num3);
    }
}