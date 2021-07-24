
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

//Law Wai Seng
public class MovePieceModel {
	
	private JButton button[] = new JButton[40];
	private String initPieceType;
	private int pieceHolder;
	private int buttonNumber;
	
	public MovePieceModel(JButton[] button, String initPieceType, int pieceHolder, int buttonNumber) {
		this.button = button;
		this.initPieceType = initPieceType;
		this.pieceHolder = pieceHolder;
		this.buttonNumber = buttonNumber;
	}
	public void movePiece(int pieceHolder, String initPieceType, int buttonNumber){

		if (pieceHolder==1) {			
			if(initPieceType.equalsIgnoreCase("ArrowBox")) {
				button[buttonNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Red/Arrow_Box.png"))));
			}else if(initPieceType.equalsIgnoreCase("Star")) {
				button[buttonNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Red/Star.png"))));
			}else if(initPieceType.equalsIgnoreCase("Cross")) {
				button[buttonNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Red/Cross.png"))));
			}else {
				button[buttonNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Red/Heart.png"))));
			}		
		} else {
			if(initPieceType.equalsIgnoreCase("ArrowBox")) {
				button[buttonNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Green/G_Arrow_Box.png"))));
			}else if(initPieceType.equalsIgnoreCase("Star")) {
				button[buttonNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Green/G_Star.png"))));
			}else if(initPieceType.equalsIgnoreCase("Cross")) {
				button[buttonNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Green/G_Cross.png"))));
			}else {
				button[buttonNumber].add(new JLabel(new ImageIcon(getClass().getResource("/images/Green/G_Heart.png"))));
			}	
		}
		
		button[buttonNumber].putClientProperty("pieceType", initPieceType);
		button[buttonNumber].putClientProperty("pieceHolder", pieceHolder);
		button[buttonNumber].revalidate();
	    button[buttonNumber].repaint();
	}
}
