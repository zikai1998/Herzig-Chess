
import javax.swing.*;

//Lim Zi Kai
public class PlayerModel{

	private static int playerType; 
	private static String pieceType; 
	private static boolean initPos;
	private static int initButtonNumber;	
	
	public PlayerModel(){

		playerType = 1; // 1 for red, 2 for green
    	
    	initial();
	}
	
	//no any chess pieces used yet
    public void initial() {
    	initPos = false; 
    	initButtonNumber = 0;
        pieceType = "null"; 
    }
    
    public int getPlayerType(){ 	
        return playerType;
    }
    
    // check if clicked chess piece holder = current player 
    public boolean currentPlayerType(int pieceHolder) {
    	if (pieceHolder == playerType) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    // change current player 
    public void changePlayer(){
        if (playerType == 1){      	
        	playerType = 2;
        } 
        else{      	
        	playerType = 1; 
        }
    }
    
    // Check if have chosen piece
    public boolean checkInitPos() {
        return initPos; //false: not used yet; true: used
    }
    
    // Initial chess pieces button position, set initial chess pieces button number to move 
    public void setInitPos(int number) {
    	initPos = true; //used
    	initButtonNumber = number; 
    }
    
    // get initial chess pieces button number
    public int getInitPos() {
        return initButtonNumber;
    }
    
    // reset after change current player; initPos = false > setInitPos again
    public void resetInitPos() {
    	initPos = false;
    }
    
    // after defeating sun, change player . Means the next player turn is loser
    public void gameOver(){
        if (playerType == 1){        	
            JOptionPane.showMessageDialog(null, "Congratulation!!!Red player win!!!Next Green First.");      
        } 
        else{        	
            JOptionPane.showMessageDialog(null, "Congratulation!!!Green player win!!!Next Red First.");
        }
    }

    // Set piece type
    public void setPieceType(String pieceTypeSelected) {
    	pieceType = pieceTypeSelected;
    } 
    
    // Get piece type
    public String getPieceType() {
        return pieceType;
    }	
}