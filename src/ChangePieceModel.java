import javax.swing.*;

//Law Wai Seng
public class ChangePieceModel {

	private JButton button[] = new JButton[40];
	private String chessPieceType;
	private int holder;
	private int afterNumber;
	
	public ChangePieceModel(JButton[] button, String chessPieceType, int holder, int afterNumber) {
		this.button = button;
		this.chessPieceType = chessPieceType;
		this.holder = holder;
		this.afterNumber = afterNumber;
	}
	
	public void setChangePiece(int holder,String chessPieceType,int afterNumber) {
		
		if(chessPieceType.equalsIgnoreCase("Star")) {
			if(holder==1) {
				button[afterNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Red/Star.png"))));
			}
			else if(holder==2) {
	        	  button[afterNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Green/G_Star.png"))));
			}
		}
		if(chessPieceType.equalsIgnoreCase("Cross")) {
			if(holder==1) {
	        	  button[afterNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Red/Cross.png"))));
			}
			else if(holder==2) {
	        	  button[afterNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Green/G_Cross.png"))));
			}
		}
		if(chessPieceType.equalsIgnoreCase("ArrowBox")) {
			if(holder==1) {
	        	  button[afterNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Red/Arrow_Box.png"))));
			}
			else if(holder==2) {
	        	  button[afterNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Green/G_Arrow_Box.png"))));
			}
		}
		if(chessPieceType.equalsIgnoreCase("Heart")) {
			if(holder==1) {
	        	  button[afterNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Red/Heart.png"))));
			}
			else if(holder==2) {
	        	  button[afterNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Green/G_Heart.png"))));
			}
		}	
		button[afterNumber].putClientProperty("pieceType", chessPieceType);
	    button[afterNumber].putClientProperty("pieceHolder",holder);
	    button[afterNumber].putClientProperty("buttonNumber",afterNumber);

	    button[afterNumber].revalidate();
	    button[afterNumber].repaint();
	}

	
}
