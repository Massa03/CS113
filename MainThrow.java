import java.util.*;
public class MainThrow extends Employee {
    private static double bonus;


    public MainThrow(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0; // bonus has yet to be awarded
    }

    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }


    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0;
        return payment;
    }

   public int vacation(){
      vacationDays = super.vacation() + 5;
      return vacationDays;
      }

   public static void main(String[] args)throws BonusTooLowException   {
   Scanner scan= new Scanner(System.in);
   BonusTooLowException problem = new BonusTooLowException("Bonus should be more than $2,000.");
   System.out.println("How many Executives would you like to have? ");
   int exec = scan.nextInt();
Executive[] exe =  new Executive[exec];

   for (int person = 0; person < exe.length; person++){
      System.out.println("Enter the name: ");
      String name = scan.nextLine();
      scan.nextLine();
      System.out.println("Enter the address: ");
      String address = scan.nextLine();
      System.out.println("Enter the phone number: ");
      String phone = scan.nextLine();
      System.out.println("Enter the SSN: ");
      String ss = scan.nextLine();
      System.out.println("Enter the payrate: ");
      double pay = scan.nextDouble();
      System.out.println("Enter the bonus: ");
      double bonus= scan.nextDouble();
    
      
   exe[person] = new Executive(name, address, phone, ss, pay);

   if (bonus<2000)
      throw problem;
   exe[person].awardBonus(bonus);
   }}
   }