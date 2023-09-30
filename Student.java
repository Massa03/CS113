public class Student{
private String name;
private GPA gpa;
//constructor
public studnet (String name, GPA gpa){
this.name =name;
this.gpa=gpa;
}
//getter 
public GPA getGpa() {return this.gpa;}

//setter
public void setName(String newName){name=newName;}
public boolean honorRoll(GPA obj){
if (gpa.compareTo(obj)>=0)
   return True;
return False;
}

public String toString() {return name+ ',' + gpa;}
   
   
    
   
}

//2d array 
double[] bestInMonths(double[][] femCellBills){
int months = famCellBills[0].length;
double[] best = new double[months];
//go through each month column
for(int month = 0;month<months;month++){
//freeze the month 
double minVal = famCellBills[0][month];
//go through each member row 
for (int member=0;member<famCellBills.length;member++)
if (famCellBills[memebr][month]< minVal)
minVal = famCellBills[member][month];

//update your best bill 
best[month]=minVal;

}
return best; 
}



//array PE2Q12
int topPlayers(Player[] team, double target){
int count=0;
for (Player player: team)
if (player.getAverage()>target)
   count++;
return count;
}