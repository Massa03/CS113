import java.util.Scanner;
public class TriangleSides {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer representing the length of one side of a right triangle:");
    int sideOne= input.nextLine(); 

   int sideTwo= (int) (Math.random()*6) + 1;
   int sideThree = (sideOne * sideOne) + (sideTwo * sideTwo);
   System.out.println(Math.sqrt (sideThree));

 

       }

}