//*****
//Massa Belal
//HW 02
//February 9, 2022
//*****

//NameApp.java 
// Asks the user for first and last name and it prints a user name 


import java.util.Scanner;
public class NameApp {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Your First name:");
      String firstName = input.nextLine();
      System.out.println("Enter Your Last name:");
      String lastName = input.nextLine();
      
      System.out.println(firstName + " " + lastName);
      char index = lastName.charAt(0);   
      System.out.println(index);  
      String index2 = firstName.substring(0, 3);
      System.out.println(index2);  
      int rand = (int) (Math.random()*50) + 1;
      System.out.println(rand);
      String user = index + index2 + rand;
      System.out.println(user); 
      
       
  }
  
}

