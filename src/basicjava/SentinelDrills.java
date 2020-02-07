package basicjava;

import java.util.Scanner;

public class SentinelDrills {

    public static boolean isOdd(int myNum){
        if (myNum % 2 == 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yourNum;
        yourNum = scan.nextInt();
        while (yourNum > 0) {
            if (isOdd(yourNum) == true)
                System.out.println("That is odd");
            else {
                System.out.println("That is even");
            }
            int count = 0;
            while (yourNum>1){
                yourNum=yourNum/2;
                count++;
            }
            System.out.println(count);
            yourNum = scan.nextInt();
        }
    }
}
