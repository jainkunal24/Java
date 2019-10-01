import java.io.*;
import java.util.*;


class Music{


	private static ArrayList<Album> albumsList = new ArrayList<Album>();
	public static void main(String[] args){

	//create new Albums 
	Album album = new Album("abc","Himesh Reshmamiya");
	album.addSong("A",4.26);
	album.addSong("B",5.60);
	album.addSong("C",3.90);
	album.addSong("D",4.55);
	albumsList.add(album);

	//creating another instance of the album and pointing to the object 
	album = new Album("bcd","Atif Aslam");
	album.addSong("E",4.80);
	album.addSong("F",4.70);
	album.addSong("G",2.80);
	album.addSong("H",3.80);
	album.addSong("I",6.20);
	albumsList.add(album);

	//creting the linked list to create the playlist to play songs on the go

	LinkedList<Song> Playlist = new LinkedList<Song>(); 
	albumsList.get(0).addToPlaylist(2,Playlist);	
	albumsList.get(1).addToPlaylist(3,Playlist);
	albumsList.get(0).addToPlaylist(1,Playlist);
	albumsList.get(1).addToPlaylist(4,Playlist);
	albumsList.get(1).addToPlaylist(45,Playlist);

	}


}







  
class Album{

	private String albumName;
	private String albumArtist;
	private ArrayList<Song> songsList;

	public Album(String albumName, String albumArtist){

		this.albumName = albumName;
		this.albumArtist = albumArtist;
		this.songsList = new ArrayList<Song>();

	}

	//function to add a song to playlist
	public void addToPlaylist(int trackNumber, LinkedList<Song> Playlist){
		
		int pos = trackNumber - 1;
		if(pos>=0 && pos<this.songsList.size()){

			Song s = this.songsList.get(pos);
			Playlist.add(s);
			System.out.println("Song " + s.getName() + " added to playlist Successfully !");

		}
		else{

			System.out.println("Song with the given track number does not exist");

		}

	}

	//funcion for authenticating whether the newly formed song already exists or not 
	public boolean addSong(String name, double duration){

		int pos = findSong(name);
		
		if(pos <0){
			this.songsList.add(new Song(name,duration));
			System.out.println("The song with title " + name + " is successfully added !");
			return true;
		}
		else{

			System.out.println("The song already exists.");
			return false;
		}
	}	

	private int findSong(String str){

		for(int i=0;i<this.songsList.size();++i){
			
			if(this.songsList.get(i).getName() == str){

				return i;
			}
		}
				return -1;

	}

}

class Song {


	private String name;
	private double duration;
	
	public Song(String name, double duration){

		this.name = name;
		this.duration = duration;

	}	

	public String getName(){

		return this.name;
	}

	
	public double getDuration(){

		return this.duration;
	}	

	
	public void setName(String name){

		this.name = name;
	}

	
	public void setDuration(double duration){

		this.duration = duration;
	}


	//for creating new instance of a song
	public Song newSong(String name, double duration){

		return new Song(name,duration);
	}

}


