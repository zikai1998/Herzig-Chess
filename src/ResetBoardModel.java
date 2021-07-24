import javax.swing.JButton;

//Law Wai Seng
public class ResetBoardModel {
	
	PlayerModel player = new PlayerModel();
	
	JButton button[] = new JButton[40];
		 
	//Constructor
	public ResetBoardModel(JButton[] button) {
		this.button = button;
	}
	
	public void resetBoard() {
	    	
	    	for(int number=0; number<40;number++) {
	    		button[number].removeAll();
	    		button[number].revalidate();
	    		button[number].repaint();	
	    		button[number].putClientProperty("buttonNumber", number);
	    		
	    		// Create model for setting chess pieces button
				ChessButtonModel model = new ChessButtonModel(button, number);
				model.setBoard();	
	    	}
    	player.changePlayer();
    }   
}
