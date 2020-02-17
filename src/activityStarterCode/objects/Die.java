package activityStarterCode.objects;

import java.util.Random;

public class Die {
     public int value=-1;
     public Random random = new Random();
     public static final int MAX_VALUE = 6;
     public int maxValue;

     public Die(){
          this(MAX_VALUE);
     }

     public Die(int maxValue){
          this.maxValue=maxValue;
     }

     public void roll(){
          value=random.nextInt(maxValue)+1;
     }

     public int getValue(){
          return value;
     }

     @Override
     public String toString() {
          if(value==1){
               return "one";
          }
          else if(value==2){
               return "two";
          }
          else if(value==3){
               return "three";
          }
          else if(value==4){
               return "four";
          }
          else if(value==5){
               return "five";
          }
          else if(value==6){
               return "six";
          }
          else {
               return "unknown";
          }
     }
}
