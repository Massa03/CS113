public class MonetaryCoin extends Coin{

private int cents; 
// getter setter for cents and an oberride tostring method 
public MonetaryCoin(int numC){
super();
cents=numC;

}

public int getCents(){

   return cents;

}

public void setCents(int c){
   cents = c;

}
@Override 
public String toString(){
   return super.toString() + " " + cents; 
   
}

}