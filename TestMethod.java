import java.util.Scanner;
public class TestMethod{
public static void main (String[] args){
Scanner input = new Scanner(System.in);
MyMethods methods = new MyMethods();
Die dice = new Die(); 
Die dice2 = new Die();


System.out.println("Enter width:");
int width = input.nextInt();
System.out.println("Enter height:");
int height = input.nextInt();
System.out.println("Enter length:");
int length = input.nextInt();

System.out.println("Surface Area" + methods.surface(width, height, length));
System.out.println("Avg Face Value" + methods.avgFaceValue(dice, dice2));
}
}