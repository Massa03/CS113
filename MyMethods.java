public class MyMethods{
public MyMethods(){

}
public int surface(int width,int length, int height){
int surface = 2*(length * width) + 2*(length * height) + 2*(height * width);
return surface;
   } 
   
public double avgFaceValue(Die one, Die two){
 return (one.getFaceValue() + two.getFaceValue()) / 2.0; 

}
}
