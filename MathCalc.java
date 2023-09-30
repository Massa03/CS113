import java.util.*;
public class MathCalc{

public static void main(String[] args){
System.out.println("Welcome to the simple math helper.");
String[] calc = {"sqrt", "log", "factorial"};
Scanner scan = new Scanner(System.in);
		System.out.println("What would you like to calculate?" + Arrays.toString(calc)
);
		String ans = scan.nextLine();
      System.out.println("Enter a number:");
      int num = scan.nextInt();
      
      if (ans == "sqrt"){
      double sR = Math.sqrt(num);
      System.out.println(sR);
      }
      else if (ans == calc[1]){
      double lg = Math.log(num);
      System.out.println(lg);
      }
      else {
    long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            
            factorial *= i; 
      }
      

}


}

}