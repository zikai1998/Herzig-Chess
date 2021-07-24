import java.awt.event.*;
import javax.swing.*;

//Law Wai Seng
public class ChessPrimaryController implements MouseListener{
	

	private JButton button[] = new JButton[40];

	int pieceHolder,buttonNumber;
	int holder;
	String chessPieceType;

	private CheckCurrentPlayerModel checkCurrentModel;
	
	private ChessPrimaryModel primaryModel;
	
	public ChessPrimaryController(JButton[] button, CheckCurrentPlayerModel checkCurrentModel, 
			ChessPrimaryModel primaryModel){
		this.button = button;
		this.checkCurrentModel = checkCurrentModel;
		this.primaryModel = primaryModel;
	}

	public void mouseClicked(MouseEvent e) {
		
		//Testing Board 
		/*
		for(int i=0;i<40;i++) {
			System.out.println(button[i].getClientProperty("pieceHolder")+ " "+button[i].getClientProperty("pieceType")+" "+button[i].getClientProperty("buttonNumber"));
		}
		*/
		
		primaryModel.primaryOperationModel(e);
		checkCurrentModel.currentPlayer(e);
		checkCurrentModel.currentPiece(e);
	
	}//end MouseClicked
	
	public void mouseEntered(MouseEvent e){};  
	public void mouseExited(MouseEvent e){};  
	public void mousePressed(MouseEvent e){};
	public void mouseReleased(MouseEvent e){}; 
	    
}
	
	


