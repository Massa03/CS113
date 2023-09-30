import java.util.Scanner;
import java.util.Random;

public class TestArrays{

static Scanner scan = new Scanner(System.in);
static Random r = new Random();

   public static int[] numberFreq(){
      System.out.println("Please enter a number:");
      int arraySize = scan.nextInt();
      int[] store = new int[arraySize];
      for (int i=0; i<arraySize; i++){
         store[i] = r.nextInt(51);
      }
   
      int [] numberFreq = new int[51];
      for(int i =0;i<store.length;i++){
        int index = store[i];
        numberFreq[index] = numberFreq[index] +1;  
        }
     return numberFreq;
     
   }
   
   public static void main(String[] args){
    int[] output = numberFreq();
    for (int i=0; i<output.length; i++){
      System.out.println(output[i]);
      }
     int[] numArray = {2,5,3,7,4,10};
     int target = 3;
     System.out.println(bigEven(numArray, target));
     Die[] dice = {new Die(),new Die()};
     System.out.println(oddDice(dice));
     
   }


public static int bigEven(int[] numArray, int target){
int num = 0;
for (int i: numArray){
if (i > target && i % 2==0){
num++;
}

}
return num; 
}
 
public static int oddDice(Die[] dice){
int count =0;
for(Die d : dice){
d.roll();
if (d.getFaceValue() %2 ==1){
count++;
}
}
return count;
}




}