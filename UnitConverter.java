//*****
//Massa Belal
//HW 01
//February 2, 2022
//*****

// 1

import java.util.Scanner; 
public class UnitConverter {
	public static void main(String[] args) {
		prob1();
		prob2();
		prob3();
	}

	public static void prob1(){
		
		// convert inch to feet
		int inch = 24;
		int inchToft = inch/12;
		System.out.println(inchToft + "ft");

	}



// 2

	public static void prob2(){
		// convert grams to pound
		Scanner input = new Scanner(System.in);
      System.out.print("Input a value in grams: ");
		float grams = input.nextFloat();
		float pounds= grams/ (float)453.592;
		System.out.println(pounds +" lbs ");
	}


// 3

	public static void prob3(){
		//convert mass value from mg to kg and g
		Scanner input = new Scanner(System.in);
		System.out.println("Input a mass value in mg: ");
		int mass = input.nextInt();
		double massInKg = mass/1000000.0;
		double massInGrams = mass/ 1000.0;
		System.out.println(mass + "mg");
		System.out.println(massInKg + "Kg");
		System.out.println(massInGrams + "g");
	}
}