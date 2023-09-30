public class Die{
//attrivutes
   private int faceValue; 
//this is a decleration
//operations
//default constructor 
   public Die(){
      faceValue = 2;
      

   }
   public void roll(){
      faceValue=(int)(Math.random()*6) + 1;
   }
   //getter 
   public int getFaceValue(){
   return faceValue;
   }
   //setter
   public void setFaceValue(int number){
      faceValue = number;
   }
   
   public String toString(){
      return ""+faceValue;
      }
      
   // equals method 
   public boolean equals(Die other){
      if (faceValue == other.getFaceValue())
         return true;
      else 
         return false;
   
   }
   
}

 