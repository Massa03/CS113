public class Volume{


 private double length, width, height;

    public Volume(double newLength, double newWidth, double newHeight)

    {

        length = newLength;

        width= newWidth;
        
        height=newHeight;

    }






public Volume(){
      length=0;
      width=0;
      height=0;
      

   }
   
    //getter 
   public double getLength(){
   return length;
   }
   public double getWidth(){
   return width;
   }
   public double getHeight(){
   return height;
   }
   
   //setter
   public void setLength(double number){
      length = number;
   }
   public void setWidth(double num2){
      width = num2;
   }
   public void setHeight(double num3){
      height=num3;
   }
   
   public String toString(){
      return "" + "l=" + length + "w=" +  width + "h=" + height;
      }
   
   
    double volumeCalc = length * height * width;
    
     // equals method fix get volumcalc if it was a function meaning def it would work 
   public boolean equals(Volume another){
      if (volumeCalc == another.getvolumeCalc())
         return "Volumes are equal";
      else 
         return "Volumes are not equal";
   
   }

     


}