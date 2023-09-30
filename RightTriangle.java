import java.util.Scanner;
public class RightTriangle{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the length of side a:");
int sideA = input.nextInt();
System.out.println("Enter the length of side b:");
int sideB = input.nextInt();

double hyp = ((sideA*sideA)+(sideB*sideB));
System.out.println("The hyp is:" + Math.sqrt(hyp));

}
}
 