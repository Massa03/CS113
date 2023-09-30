import java.util.Arrays;

public class TestArraysAndRecursion{
public static int[][] initialize(int[][] arr){
   for(int row=0; row<arr.length; row++){
      for (int column=0; column<arr[0].length; column++){
         arr[row][column]=row + column;
         if (row == column){
         arr[row][column]= -1;
        
         }
      }
   }
   return arr;
} 
public static void main (String[] args){
int[][] test = new int[5][5];
int[][] testPrint = initialize(test);
for(int row=0; row<test.length;row++){
   for(int column=0;column<test[0].length;column++){
      System.out.print(testPrint[row][column] + " ");
      
      

   }
   System.out.println("");
}

Die[][] die = new Die[2][3]; 
for(int i=0;i<die.length;i++)
for (int j=0; j<die[0].length;j++)
die[i][j] = new Die();
   
 int[] test2 = dieStats(die);
 System.out.println(Arrays.toString(test2));   
 
 printDigits(98547);
 
 int [] arr = {1,2,3,4,5};
      System.out.println(sumArray(arr, 3));
}

public static int[] dieStats(Die[][] dice){
int[] testDie = new int[dice.length];  
   int count=0;
    for(int row=0; row<dice.length; row++){
      for (int column=0; column<dice[0].length; column++){
         dice[row][column].roll();
         if (dice[row][column].getFaceValue() % 2==0){
            count++;
            
         
         
         }
         }
   
 testDie[row] = count;
   count=0;

   }
   
  return testDie;

}


      
 
    public static void printDigits(int num) {
        if (num / 10 == 0) {
            System.out.println(num);
        }
        else{
            
            int firstDigit;
            int totalDigits = (int) Math.log10(num);
            firstDigit = (int) (num/ (int) Math.pow(10,totalDigits));
            System.out.println(firstDigit);
            
            printDigits(num % (int) Math.pow(10,totalDigits));
        }
        
    }     
  public static int sumArray(int[] arr, int ntd) {
        int sum = 0;
        if (ntd == 0) {
            return 0;
        }
        else {
            sum += arr[ntd-1];
            sum += sumArray(arr, ntd-1); 
        }
        return sum;
        
    }

  } 


