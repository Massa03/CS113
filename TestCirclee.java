import java.util.*;
public class TestCirclee{
public static void main(String[] args){

Circlee c1 = new Circlee(rad);
Circlee c2 = new Circlee((int)(Math.random()*11+5));

Scanner scan = new Scanner(System.in);
System.out.println("Enter radius:");
int radius = scan.nextInt();



System.out.println("c1 area:" + c1.area());
System.out.println("c2 area:" + c2.area());

c1.setRad(c2.getRad()); 
c2.setRad(c1.getRad());

System.out.println(c1);
System.out.println(c2);
}
}
 