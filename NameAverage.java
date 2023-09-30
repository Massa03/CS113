// NameAverage.java
// it asks the user for 4 different name and it prints out the first character of each name and calculate the average length 
import java.util.Scanner;
public class NameAverage{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.println("Enter student 1 name: ");
   String student1 = input.nextLine();
   System.out.println("Enter student 2 name: ");
   String student2 = input.nextLine();
   System.out.println("Enter student 3 name: ");
   String student3 = input.nextLine();
   System.out.println("Enter student 4 name: ");
   String student4 = input.nextLine();
   
   char initial1 = student1.charAt(0);
   char initial2 = student2.charAt(0);
   char initial3 = student3.charAt(0);
   char initial4 = student4.charAt(0);
   System.out.println(initial1 + " " + initial2 +" "+ initial3 + " " + initial4);
   int sum = student1.length() + student2.length() + student3.length() + student4.length();
   int totalSum = sum/4;
   System.out.println(totalSum);



   }
}   
   