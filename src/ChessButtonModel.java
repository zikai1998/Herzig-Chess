
import java.awt.*;
import javax.swing.*;

//JIMMY LIM JUN BING 
public class ChessButtonModel{
	
	private JButton button[] = new JButton[40];
	private int number;
	
	public ChessButtonModel(JButton[] button, int number) {
		this.button = button;
		this.number = number;
	}
	
	public JButton setBoard() {
		this.button[this.number].setLayout(new BorderLayout());
		JLabel imageContainer;
		ImageIcon image;
		
		if(this.number>=0 && this.number<=4) {
			if (this.number==0 || this.number==4) {
				image = new ImageIcon(getClass().getResource("/images/Green/G_Star.png"));
				imageContainer = new JLabel(image);
				this.button[this.number].add(imageContainer,BorderLayout.CENTER);
				this.button[this.number].putClientProperty("pieceType", "Star");
				this.button[this.number].putClientProperty("pieceHolder", 2);
			}
			if (this.number==1 || this.number==3) {			
				image = new ImageIcon(getClass().getResource("/images/Green/G_Cross.png"));
				imageContainer = new JLabel(image);
				this.button[this.number].add(imageContainer,BorderLayout.CENTER);
				this.button[this.number].putClientProperty("pieceType", "Cross");
				this.button[this.number].putClientProperty("pieceHolder", 2);
			}
			if (number==2) {
				image = new ImageIcon(getClass().getResource("/images/Green/G_Heart.png"));
				imageContainer = new JLabel(image);
				this.button[this.number].add(imageContainer,BorderLayout.CENTER);
				this.button[this.number].putClientProperty("pieceType", "Heart");
				this.button[this.number].putClientProperty("pieceHolder", 2);
			}
		}else if(this.number>=6 && this.number<=8) {
			image = new ImageIcon(getClass().getResource("/images/Green/G_Arrow_Box.png"));
			imageContainer = new JLabel(image);
			this.button[this.number].add(imageContainer,BorderLayout.CENTER);
			this.button[this.number].putClientProperty("pieceType", "ArrowBox");
			this.button[this.number].putClientProperty("pieceHolder", 2);	
		}
		else if(this.number >=31 && this.number <=33) {
			image = new ImageIcon(getClass().getResource("/images/Red/Arrow_Box.png"));
			imageContainer = new JLabel(image);
			this.button[number].add(imageContainer,BorderLayout.CENTER);
			this.button[number].putClientProperty("pieceType", "ArrowBox");
			this.button[number].putClientProperty("pieceHolder", 1);		
		}
		else if (this.number>=35 && this.number<=39) {
			if(this.number==35 || this.number==39) {
				image = new ImageIcon(getClass().getResource("/images/Red/Star.png"));
				imageContainer = new JLabel(image);
				this.button[this.number].add(imageContainer,BorderLayout.CENTER);
				this.button[this.number].putClientProperty("pieceType", "Star");
				this.button[this.number].putClientProperty("pieceHolder", 1);
			}
			if (this.number==36 || this.number==38) {
				image = new ImageIcon(getClass().getResource("/images/Red/Cross.png"));
				imageContainer = new JLabel(image);
				this.button[this.number].add(imageContainer,BorderLayout.CENTER);
				this.button[this.number].putClientProperty("pieceType", "Cross");
				this.button[this.number].putClientProperty("pieceHolder", 1);
			}
			if (this.number==37) {
				image = new ImageIcon(getClass().getResource("/images/Red/Heart.png"));
				imageContainer = new JLabel(image);
				this.button[this.number].add(imageContainer,BorderLayout.CENTER);
				this.button[this.number].putClientProperty("pieceType", "Heart");
				this.button[this.number].putClientProperty("pieceHolder", 1);
			}
		}else {
			this.button[this.number].putClientProperty("pieceType", "null");
			this.button[this.number].putClientProperty("pieceHolder", 0); 		
		}
	 	
		return this.button[this.number];
	}
}
