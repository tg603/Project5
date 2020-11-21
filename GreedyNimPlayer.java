/**
*Class for the GreedyNimPlayer
*Implements player moves 
*
*@author Zach 'TG' Thoroughgood
*
*/

//packages for the code
import java.util.ArrayList;

//Also had help on this during the tutoring hours!

public class GreedyNimPlayer extends Player<GreedyNim>{

/**
*@param Class Constructor
*
*Contains no contents
*/
	public GreedyNimPlayer (){
		
	}
/**
*
*@param toString() Method
*@returns Name of the Player
*
*/
	public String toString(){
		return new String("TG");
	}
	
/**
*
*@param getMove() Method
*@returns A legal move for the player to make
*
*/
	public GreedyNim getMove(GreedyNim position, int playerId){
		PurePriorityQueue<Integer> game = position.getPiles();
		game.remove();
		ArrayList<Integer> piece = new ArrayList<Integer>();
		//Do/While Loop
		//Creates a new ArrayList<Int> under *piece*
		//If piece isn't empty, the do/while will go on
		//Once piece is empty it will take away that piece all together by returning new GreedyNim(piece)
		//Just like Project3 with popping out off the top
		do {
			piece.add(game.remove());
		}while(!piece.isEmpty());
		//If statement doesn't work in this case
		//Do/While is better for contiously checking without having tons of if/then statements
		/* else{
			return new GreedyNim(piece);
		}
		*/
		/*
		piece.add(2);
		piece.add(1);
		if(game == piece){
			game.add(1);
		}else{
			*/
	return new GreedyNim(piece);
	}
/** 
* Unit test for class()
*@param args Arguments used to test this class.
*/
	public static void main(String[] args){
		//All the testing I have been doing via the Mimir ones 
	}
}