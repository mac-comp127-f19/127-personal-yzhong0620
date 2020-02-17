package activityStarterCode.objects;

public class DiceRoller {
    public static void main(String [] args) {
        int i=1;
        Die myDie = new Die();
        while(i<=10){
            myDie.roll();
            System.out.println("Roll " + i + " generated a " + myDie);
            i++;
        }
        Die d2 = new Die();
        int x=0;
        int y=1;
        while(y<=1000000){
            myDie.roll();
            d2.roll();
            if (myDie.getValue()==d2.getValue()){
                x++;
            }
            y++;
        }
        System.out.println("In 1,000,000 rolls, two dice agreed "+x+" times");
    }
}
