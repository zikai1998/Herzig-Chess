import javax.swing.*;

//Law Wai Seng
public class FlipModel {

	private JButton[] button = new JButton[40];
	private ChangePieceModel changePieceModel;
	private RemovePieceModel removePieceModel;
	
	FlipModel(JButton[] button, ChangePieceModel changePieceModel, RemovePieceModel removePieceModel ){
		this.button = button;
		this.changePieceModel = changePieceModel;
		this.removePieceModel = removePieceModel;
	}
	
	public void flip() {
		// flip board
					
		int lastChess=0;
		int holder[] = new int[40];
		String chessPieceType[] = new String[40];
						
		// save the current button holder and piece type
		for (int i=0;i<40;i++) {
			holder[i]=(int)button[i].getClientProperty("pieceHolder");
			chessPieceType[i]=(String)button[i].getClientProperty("pieceType");
			removePieceModel.removePiece(i);
		}
									
		// load the current button to opposite side 
		for (int i=40;i>0;i--) {
			changePieceModel.setChangePiece(holder[i-1],chessPieceType[i-1],lastChess);
			lastChess++;
		}
	} //end flip
}

