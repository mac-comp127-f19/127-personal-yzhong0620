package basicjava;

public class BasicStuff{

    public static void main(String[] args){
        System.out.println("Hello world");

        int age0 = 19, age1 = 20;
        System.out.println("We are" + age0 + "and" + age1 + "years old!");

        int sumOfAges = age0 + age1;
        System.out.println("The sum of our ages is " + sumOfAges);
        System.out.println("The sum of our ages is " + (age0 + age1));

        System.out.println(6/3);
        System.out.println(6/4);
        System.out.println((double) 6/4);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println((double)1600/60);
        System.out.println((double)1600/60/7);

        double V, A;
        final double h = 5;
        final double r = 2;
        V = Math.PI*h*r/3;
        A = Math.PI*r*r+Math.PI*r*Math.sqrt(r*r+h*h);
        System.out.println(V);
        System.out.println(A);

    }
}
