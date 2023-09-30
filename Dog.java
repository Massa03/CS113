public class Dog{
//default constructor
   private String dogName;
   private double dogWeight;

   public Dog(){
      dogName = "dog";
   
      dogWeight = 0;
      
   }
  
   
//getter 
   public String getDogName(){
   return dogName;
   }
   public double getDogWeight(){
   return dogWeight;
   } 
//setter
   public void setDogName(double number){
   dogWeight = number;
   }
 
   
   public double toKgs(){
  return dogWeight * 0.453592;
   }
   
   public String toString(){
   return "Name:" + dogName + "Weight:"+ dogWeight;
  
   }
}