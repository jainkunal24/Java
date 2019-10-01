import java.io.*;
import java.util.*;

class Generics{

	public static void main(String[] args){

	ArrayList<Team> TeamList = new ArrayList<Team>();
	Team<FootballPlayer> t = new Team("Football Team");
	Team<BaseballPlayer> t1 = new Team("Base Ball Team");
	Team<SoccerPlayer> t2 = new Team("Soccer Team");
	TeamList.add(t);
	FootballPlayer f = new FootballPlayer("Joseph");
	 t.addPlayer(f); 
	BaseballPlayer b = new BaseballPlayer("Ahmad");
	SoccerPlayer s = new SoccerPlayer("Narayan");
	t1.addPlayer(b);
               	t2.addPlayer(s);
 	System.out.println(t.ListSize());
	} 
}

abstract class Player{

	private String name;
	public Player(String name){

		this.name = name;
	}
	
	public String getName(){

		return this.name;		
	}
}

class FootballPlayer extends Player{

	public FootballPlayer(String name){
		super(name);
	}
}


class SoccerPlayer extends Player{

	public SoccerPlayer(String name){
		super(name);
	}
}


class BaseballPlayer extends Player{

	public BaseballPlayer(String name){
		super(name);
	}
}

class Team<T extends Player>{

	private String name;
	private static int Tied=0,Won=0,Lost=0,played=0;
	public Team(String name){

		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

	ArrayList<T> list = new ArrayList<>();
	
	public boolean addPlayer(T player){

		if(this.list.contains(player)){

			System.out.println(player.getName() + " Already exitst in the list of Players.");
			return false;
		}
		else{
	
			this.list.add(player);
			System.out.println(player.getName() + " Succesfully added to the Players list.");
		}
		return true;

	}

	public int Result(){
	
		int x = (2*this.Won) + this.Tied;
		return x;
	}	

	public void UpdateResult(Team opponent, int OurScore,int OpponentScore){
	
		if(OurScore > OpponentScore)
		this.Won = this.Won+1;
		else if(OurScore< OpponentScore)
		this.Lost = this.Lost+1;
		else if(OurScore == OpponentScore)
		this.Tied = this.Tied+1;
		this.played = this.played+1;
		//To simultaneously update result of the opponent according to scores 
		if(opponent != null){
			opponent.UpdateResult(null,OurScore,OpponentScore);
		}
	}

	public int ListSize(){

		return this.list.size();
	}
	
}