package basicjava;
import java.util.Scanner;

public class Hypotenuse {
    public static double calculateHypotenuse(double length1, double length2) {
        return Math.sqrt(length1*length1 + length2*length2);
    }

    public static void main(String[] args){
        double lgt1,lgt2;
        Scanner scan = new Scanner(System.in);
        lgt1 = scan.nextDouble();
        lgt2 = scan.nextDouble();
        System.out.println(calculateHypotenuse(lgt1,lgt2));
    }
}