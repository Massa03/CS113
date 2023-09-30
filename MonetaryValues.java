import java.util.Scanner;
import java.util.Random;

public class MonetaryValues{
static Scanner scan = new Scanner(System.in);
static Random r = new Random();

public static void randomMV(MonetaryCoin[] arr){

   // go throuh each coin set value and flip it will get the hih=ghest tail value 
     
      for (int i=0; i<arr.length; i++){
       
       int index = i;
        int cents = (int)(Math.random()*100)+1;
         MonetaryCoin c = new MonetaryCoin(cents);
         arr[index]= c;
      }
   
      
      

}

public static void main(String[] args){
MonetaryCoin[] coins = new MonetaryCoin[20];
randomMV(coins); 
int maxTails = -1;
for (int i=0; i<coins.length; i++){
coins[i].flip();
if (coins[i].isHeads() != true){
   System.out.println(coins[i]);
   if(maxTails<coins[i].getCents()){
   maxTails= coins[i].getCents();
   }
}
} 
System.out.println(maxTails);
}
}