package LAB11Package;	
import java.util.*;
import java.io.*;

class Individuals{
	int matches;
	String name;
	String individualType;
	int age;
	public Individuals(int matches,String name,String individualType,int age){

		this.matches = matches;
		this.name = name;
		this.individualType = individualType;
		this.age = age;
		//this.displayData();
	}

	public void displayData(){
		System.out.println("New member added into the Cricket Fraternity !! and he is a "  +  this.individualType );
	}	
}

class Umpire extends Individuals{

	double accuracy;
	String nationality;

	public Umpire(int matches,String name,String individualType,int age,double accuracy,String nationality ){

		super(matches,name,individualType,age);
		this.accuracy = accuracy;
		this.nationality = nationality;
		this.displayData();
	}

	@Override
	public void displayData(){
		System.out.println("_____________________________________");
		System.out.println("Umpire's Records"); 	
		System.out.println("_____________________________________");
		System.out.printf("\n%s    %s",super.individualType,super.name);
		System.out.printf("\n%d years of age and is from %s",super.age,nationality);
		System.out.printf("\nHas Stood in %d international matches",super.matches);
		System.out.printf("\nAccuracy of %3.2f in making decisions",accuracy);
		System.out.printf("\n_____________________________________");
	}	
}

class Cricketer1 extends Individuals{

	int manOfMatchAwards;
	public Cricketer1(int matches,String name,String individualType,int age,int manOfMatchAwards){

		super(matches,name,individualType,age);
		this.manOfMatchAwards = manOfMatchAwards;
		//this.displayData();
	}
}

class Batsman extends Cricketer1{

	int runs;
	int tons;
	double average;
	double strikeRate;
	public Batsman(int matches,String name,String individualType,int age,int runs,int tons,double strikeRate,int manOfMatchAwards){

		super(matches,name,individualType,age,manOfMatchAwards);
		this.runs = runs;
		this.tons = tons;
		this.average = (double)runs/(double)matches;
		this.strikeRate = strikeRate;
		this.displayData();
	}
	
	@Override
	public void displayData(){
		System.out.println("_____________________________________");
		System.out.println("Batsman's Records"); 	
		System.out.println("_____________________________________");
		System.out.printf("\n%s    %s",super.individualType,super.name);
		System.out.printf("\n%d International Centuries",this.tons);
		System.out.printf("\n%d international runs with an average of %4.2f",this.runs,this.average);
		System.out.printf("\nReceived %d Man of Match Awards.",super.manOfMatchAwards);
		System.out.printf("\n_____________________________________");
		System.out.printf("\nOver-Ridden Method From Batsman Class Executed Succefully!!");
		System.out.printf("\n_____________________________________");
	}	

}

class Bowler extends Cricketer1{

	int wickets;
	int fivewiHaul;
	double bowlingAverage;
	public Bowler(int matches,String name,String individualType,int age,int wickets,int fivewiHaul,double bowlingAverage,int manOfMatchAwards){

		super(matches,name,individualType,age,manOfMatchAwards);
		this.wickets = wickets;
		this.fivewiHaul = fivewiHaul;
		this.bowlingAverage = bowlingAverage;
	}
	@Override
	public void displayData(){
		System.out.println("_____________________________________");
		System.out.println("Bowler's Records"); 	
		System.out.println("_____________________________________");
		System.out.printf("\n%s    %s",super.individualType,super.name);
		System.out.printf("\n%d International Wickets",this.wickets);
		System.out.printf("\n%d international wickets with an average of %4.2f",this.wickets,this.bowlingAverage);
		System.out.printf("\nReceived %d Man of Match Awards.",super.manOfMatchAwards);
		System.out.printf("\n_____________________________________");
		System.out.printf("\nOver-Ridden Method From Bowler Class Executed Succefully!!");
		System.out.printf("\n_____________________________________");
	}	

}


class AllRounder extends Cricketer1{

	int runs;
	int wickets;
	int tons;
	int fivewiHaul;
	public AllRounder(int matches,String name,String individualType,int age,int runs,int wickets,int tons,int fivewiHaul,int manOfMatchAwards){

		super(matches,name,individualType,age,manOfMatchAwards);
		this.runs = runs;
		this.wickets = wickets;
		this.tons = tons;
		this.fivewiHaul = fivewiHaul;
	}
	@Override
	public void displayData(){
		System.out.println("_____________________________________");
		System.out.println("All-Rounder's Records"); 	
		System.out.println("_____________________________________");
		System.out.printf("\n%s    %s",super.individualType,super.name);
		System.out.printf("\n%d International runs and %d International Centuries",this.runs,this.tons);
		System.out.printf("\n%d International Wickets and %d 5 Wicket hauls .",this.wickets,this.fivewiHaul);
		System.out.printf("\nReceived %d Man of Match Awards.",super.manOfMatchAwards);
		System.out.printf("\n_____________________________________");
		System.out.printf("\nOver-Ridden Method From All-Rounder Class Executed Succefully!!");
		System.out.printf("\n_____________________________________");
	}	

}







