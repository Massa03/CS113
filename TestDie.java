public class TestDie {
   public static void main(String[] args){
   //create two dice
   Die die1 = new Die();
   Die die2 = new Die();
   System.out.println(die1 == die2);
   System.out.println(die1.getFAceValue()+","+ die2.getFaceValue());
   //roll them
   die1.roll();
   die2.roll();
   //die2.setFaceValue(5); //if we want die1 a refrence number and die 2 a specific number which is 5 

  
   //print their face values if possible 
   System.out.println(die1.getFaceValue()+","+ die2.getFaceValue());
   // or to let die 1 refrence and die 2 specific you print the following 
    System.out.println(die1.toString()+","+ die2.toString());
   }
}

//create a die object that rolls 10 times and count how many times it lands on a 3 
Die d = new Die();
int total = 0;
for(int i=0; i<100; i++){
d.roll();
if (d.getFaceValue() ==3)
total++;


}

System.out.println("NUMBER OF 3'S" + total);
}