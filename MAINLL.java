import java.io.*;
import java.util.*;


class MAINLL{
	
	public static CollectionOfLists c = new CollectionOfLists();
	public static void main(String[] args){

		LL newList = LL.newLinkedList();
		newList.insert(2);
		newList.insert(4);
		newList.insert(6);
		newList.insert(8);
		newList.insert(10);
		c.addNewList(newList);		
		

		newList = LL.newLinkedList();
		newList.insert(12);
		newList.insert(14);
		newList.insert(16);
		newList.insert(18);
		newList.insert(20);
		c.addNewList(newList);

		newList = LL.newLinkedList();
		newList.insert(22);
		newList.insert(24);
		newList.insert(26);
		newList.insert(28);
		newList.insert(30);
		c.addNewList(newList);
		newList = LL.newLinkedList();
		newList.insert(32);
		newList.insert(34);
		newList.insert(36);
		newList.insert(38);
		newList.insert(40);
//		c.addNewList(newList);
//newList = LL.newLinkedList();
		newList.insert(42);
		newList.insert(44);
		newList.insert(46);
		newList.insert(48);
		newList.insert(50);
		c.addNewList(newList);

		c.getList(1).insert(1111);
		c.getList(1).insert(2222);
		c.getList(1).insert(3333);
		c.printAllLists();

	}


}


class CollectionOfLists{

	private static ArrayList<LL> myListOfLLs;

	public LL getList(int i){
		
		return myListOfLLs.get(i);
	}

	public CollectionOfLists(){
		this.myListOfLLs = new ArrayList<LL>();
	}

	public void addNewList(LL newList){

		this.myListOfLLs.add(newList);
	}

	public void printAllLists(){

		for(int i=0;i<this.myListOfLLs.size();++i){
	
			LL list = this.myListOfLLs.get(i);
			System.out.println(this.myListOfLLs.get(i));
			list.printList();
			System.out.println();
		}
	}


}

class Node{

	 int data;
	 Node nextlink;
		
	public Node(int data){	

		this.data = data;
		this.nextlink = null;
	}
}

class LL{
	private Node start;
	private Node last;

	//Linked-List constructor
	public LL(){

		this.start = null;
		this.last = null;
	}

	//creation of a new Linked-List
	public static LL newLinkedList(){

		return new LL();
	}

	public void insert(int data){
		//creating a new instance of a node
		Node newnode = new Node(data);
		newnode.nextlink = null;
		if(this.start == null){
			
			this.start = newnode;
			this.last = newnode;
		}
		else{
	
			last.nextlink = newnode;
			last = newnode;
		}
		System.out.println("Inserted		:" + data);
	} 

	public void printList(){

		if(start == null){
			System.out.println("Empty List !!!");
		}
		else{
			
			Node temp = start;
			System.out.println();
			while(temp != null){
			
				System.out.println(temp.data);
				temp = temp.nextlink;
			}

		}
	}


}






