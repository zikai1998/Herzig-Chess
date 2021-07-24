import javax.swing.*;

//Law Wai Seng
public class RemovePieceModel {
	
	private JButton[] button = new JButton[40];
	
	RemovePieceModel(JButton[] button){
		this.button = button;
	}
	public void removePiece(int buttonNumber) {
		button[buttonNumber].removeAll();
		button[buttonNumber].revalidate();
		button[buttonNumber].repaint();
		button[buttonNumber].setBorder(BorderFactory.createLineBorder(null));
		button[buttonNumber].putClientProperty("pieceType", "null");
		button[buttonNumber].putClientProperty("pieceHolder", 0);	
	}
}
