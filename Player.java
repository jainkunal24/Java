package LAB11;
import java.util.*;
import java.io.*;

interface ISaveable{
	
	//creation of two methods that can be further overridden
	public List<String> write();
	public void read(List<String> savedValues);
}

public class Player implements ISaveable{

	private String name;
	private int hitPoints;
	private int life;
	private String weapon;

	public Player(String name, int hitPoints,int life){

		this.name = name;
		this.hitPoints = hitPoints;
		this.life = life;
		this.weapon = "MachineGun";
	}

	public String getName(){
		return this.name;	
	}
	public int gethitPoints(){
		return this.hitPoints;
	}
	public int getlife(){
		return this.life;
	}
	public String getweapon(){
		return this.weapon;
	}
	public void setName(String name){
		this.name = name;
	}
	public void sethitPoints(int hitPoints){
		this.hitPoints = hitPoints;
	}
	public void setlife(int life){
		this.life = life;
	}
	public void setweapon(String weapon){
		this.weapon = weapon;
	}

	//over-riding the functions of the interface
	@Override
	public List<String> write(){
		
		List<String> values = new ArrayList<String>();
		values.add(0,this.name);
		values.add(1,this.hitPoints + "");
		values.add(2,this.life + "");
		values.add(3,this.weapon);
		return values;	
	}

	@Override
	public void read(List<String> savedValues){
		if(savedValues != null && savedValues .size()>0){

			this.name = savedValues.get(0);
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.life = Integer.parseInt(savedValues.get(2));
			this.weapon = savedValues.get(3);
		}
	}	

	@Override
	public String toString(){

		return "Player Details:- " + " {" + "Name:- " + name + " , " + "Hit Points:- " + hitPoints + " , " + "Life:- " + life + " , "  + "Weapon:- " + weapon  + " }";  
	}


}