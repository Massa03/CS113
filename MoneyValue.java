public class MoneyValue {
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter an integer represents a monetary value in cents:");
   int value = scan.nextInt();
   int dollar = value/100;
   int quarter = (value%100)/25;
   int penny = (value%100)%25;
   System.out.println("dollar + "dollar" + quarter + "quarter" + penny + "penny"");
   }
}