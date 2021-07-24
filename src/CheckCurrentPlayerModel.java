import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Nicholas Wong Tian Shun
public class CheckCurrentPlayerModel {
	
	 JButton button[] = new JButton[40];
	 PlayerModel player = new PlayerModel();
	 
	 CheckCurrentPlayerModel(JButton[] button) {
		 this.button = button;
	 }
	 
	public void currentPlayer(MouseEvent e) {
		if (player.getPlayerType()==1) {
			for (int i=0;i<40;i++) {
				button[i].setBorder(BorderFactory.createLineBorder(Color.RED,1));
			}
		}
		else {
			for (int i=0;i<40;i++) {
						button[i].setBorder(BorderFactory.createLineBorder(Color.GREEN,1));
			}
		}
	}
			
	public void currentPiece(MouseEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		buttonClicked.setBorder(BorderFactory.createLineBorder(Color.YELLOW,3));
	}
}
