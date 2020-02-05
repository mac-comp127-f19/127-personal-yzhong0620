package basicjava;

public class DoNDrills {

    public static void main(String[] args){
        int i = 0;
        int j = 1;
        while (i<10) {
            System.out.println(i);
            i++;
        }
        while (i>=0) {
            System.out.println(i);
            i--;
        }
        while (j<=256) {
            System.out.println(j);
            j = j*2;
        }
        j = 1;
        while (j<=256) {
            System.out.println(j-1);
            j = j*2;
        }
    }
}
