public class Circlee{
private int radius;
public Circlee(int rad){
rad = radius;

}
public Circlee(){
radius= 5;
}
public int getRad(){
return radius;
}
public void setRad(int r){
radius = r;

}
public String toString(){
return ""+radius;
}
public double area(){
return Math.PI*Math.pow(radius, 2);
}
}