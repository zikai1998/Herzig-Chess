
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.JButton;

//Lim Zi Kai
public class ChessMenuSaveController implements ActionListener{
	//... The Controller needs to interact with both the Model and View.
	private JButton[] button = new JButton[40];
	private ChessPrimaryView view;
	
	 /** Constructor */
	public ChessMenuSaveController(JButton[] button) {
		this.button = button;
		
	}
	public void actionPerformed(ActionEvent e) {
		
		try{
			FileWriter file = new FileWriter("T.txt",false);
			PrintWriter filewrite = new PrintWriter(file);
			int lastChess=0;
			int holder[] = new int[40];
			String chessPieceType[] = new String[40];
			
			// save the current button holder and piece type
			for (int i=0;i<40;i++) {
				holder[i]=(int)button[i].getClientProperty("pieceHolder");
				chessPieceType[i]=(String)button[i].getClientProperty("pieceType");
				filewrite.println(holder[i]);
				filewrite.println(chessPieceType[i]);
			}
			
			
			filewrite.close();
		}catch(Exception x){
			System.out.println("ERROR");
		}
	}
	

}
