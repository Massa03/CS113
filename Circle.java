// defining class the represtent circlr with radius and its center
public class Circle{
private Point center = new Point();
private int radius = 0;
public Circle(Point newCenter, int newRadius){
    center=newCenter;
    radius=newRadius;
      
   }
 public int getCenter(){
   return center;
   }
   public int getRadius(){
   return radius;
   } 

   public void setCenter(Point num){
   center = num;
   }
 
  public void setRadius(int num){
  radius = num;
  }
   
  public boolean equals(circle other){
  if (radius == other.getRadius())
  {
   return true;
   }
   else
   {
   return false;
    }
    
   double area = 3.14 * radius * radius;
   public double getArea(double area){
   return area;
   }
   
   
   public String toString(){
   return "Center:" + center + "Radius:"+ radius;



}
public void randCoor(){
      point1=(Point)(Math.random()*24) + 1;
   }
}