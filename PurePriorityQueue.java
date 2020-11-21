/**
* Class implements a PurePriorityQueue
* @author Zach 'TG' Thoroughgood
*/

//packages for my code
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.*;

public class PurePriorityQueue<E extends Object>{
	
/**
*@param ArrayList<E> myList
*@param Comparator<E> Comp 
*Private instance variables 
*The first one sets an ArrayList of element to myList
*The second is the Comparater of element for abbreviated Comp
*/

//variables for the code
	private ArrayList<E> myList;
	
	private Comparator<E> Comp;
	
	
/**
*@param Constructor PurePriorityQueue
*Constructor for the class takes the Comparator and an item
*Sets myList to a new empty ArrayList of an element
*Item is set equal to the Comparator
*/
	public PurePriorityQueue(Comparator<E> item){
		myList = new ArrayList<E>();
		Comp = item;
	}
	
/**
*
*@param method toString()
*@return String 
*This method returns myList and labels the Beginning and End of it
*/
	public String toString(){
		return ("Begin" + myList + "End");
	}
	
/**
*
*
*/	
	public boolean add(E item){
		return myList.add(item);
	}

/**
*@param method isEmpty()
*This method checks wether an ArrayList is empty
*@return boolean
*Returns a recursive call with the ArrayList of myList
*/
	
	public boolean isEmpty(){
		return myList.isEmpty();
	}
	
//had help during the tutoring hours for code in here via Lucy who is a great help for me and the other students!
//built it alongside other students who were also confused
//the sort method I figured out has to be named sort in order for collections to work/the actual method to run

/**
*@param sort() method
*This sort() method compiles an ArrayList into a new one called other
*Allows ArrayLists to be sorted via the comparator created above
*@return void
*/
	public void sort() {
		ArrayList<E> other = new ArrayList<E>();
		for(int i = 0; i < myList.size() - 1; i++){
			int banana = (0);
			E monkey = myList.get(i);
			if (Comp.compare(myList.get(banana), monkey) < 0){
				banana = i;
			}
			other.add(myList.get(banana));
			myList.remove(banana);
		}
		for(int i = 0; i < myList.size() - 1; i++){
			myList.add(other.get(i));
		}
	}
/**
*@param method element()
*This method gives the highest priority in the ArrayList
*Collections is used with the made sort method to find the highest priority element
*Collections is brought in with the package util.java.ArrayList above the class namespace
*@return E
*Returns the element of E example: (string, integer, etc.)
*/
	public E element() {
		if(myList.isEmpty()){
			throw new NoSuchElementException("myList is empty!");
		}else{
			Collections.sort(myList, Comp);
			return myList.get(0);
		}
	}
/**
*@param method remove()
*This method sorts the ArrayList given and removes the first element inside index (0)
*@return element E
*Returns the element inside the first index of 0
*/
	public E remove(){
		if(myList.isEmpty()){
			throw new NoSuchElementException("myList is empty!");
		}else{
			Collections.sort(this.myList, Comp);
			return myList.remove(0);
		}
	}
	
/**
*This method checks to see if an ArrayList has the same element as another
*Checks with the help from the Comparator
*@param method hasSameElementsAs()
*@param PurePriorityQueue<E> other
*@return boolean 
*Returns the value of isTrue if they contain the element
*/
	public boolean hasSameElementsAs(PurePriorityQueue<E> other){
		ArrayList<E> thing = new ArrayList<E>();
		ArrayList<E> item = new ArrayList<E>();
		for(int i = 0; i < myList.size(); i++){
			E box = myList.get(i);
			thing.add(box);
		}		
		for(int i = 0; i < other.myList.size(); i++){
			E box = other.myList.get(i);
			item.add(box);
	}
	item.sort(Comp);
	thing.sort(Comp);
	boolean isTrue = thing.equals(item);
	return isTrue;
	}
/** 
* Unit test for class()
*@param args Arguments used to test this class.
*/
	public static void main(String[] args){
		//All the testing I have been doing via the Mimir ones 
	}
}