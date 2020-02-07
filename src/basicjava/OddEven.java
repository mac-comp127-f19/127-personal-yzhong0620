package basicjava;

import java.util.Scanner;

public class OddEven {
    public static boolean isOdd(int myNum){
        if (myNum % 2 == 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int yourNum;
        yourNum = scan.nextInt();
        if (isOdd(yourNum)==true)
            System.out.println("That is odd");
        else
            System.out.println("That is even");

        if (isOdd(yourNum)==true)
            System.out.println("Wow, that's odd!");
    }
}