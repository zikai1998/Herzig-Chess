import javax.swing.*;


//Law Wai Seng
public class RoundModel {

	private JButton[] button = new JButton[40];
	private int holder;
	private String chessPieceType;
	private RemovePieceModel removePieceModel;
	private ChangePieceModel changePieceModel;
	private int afterRounds;

	RoundModel(JButton[] button, RemovePieceModel removePieceModel, ChangePieceModel changePieceModel){
		this.button = button;
		this.removePieceModel = removePieceModel;
		this.changePieceModel = changePieceModel;
	}
	public void round(int rounds) {
		// 4 turns Change chess piece function
		afterRounds=rounds;	
					if (rounds == 4) {
						for (int i=0;i<40;i++) {
							if (((String) button[i].getClientProperty("pieceType")).equalsIgnoreCase("Cross") || ((String)button[i].getClientProperty("pieceType")).equalsIgnoreCase("Star")) {
								if ( (int)button[i].getClientProperty("pieceHolder") == 1) {
									if (((String)button[i].getClientProperty("pieceType")).equalsIgnoreCase("Star")) {
										chessPieceType="Cross";
									}
									if (((String)button[i].getClientProperty("pieceType")).equalsIgnoreCase("Cross")) {
										chessPieceType="Star";
									}
									holder=1;
								}
								if ( (int)button[i].getClientProperty("pieceHolder") == 2) {
									if (((String)button[i].getClientProperty("pieceType")).equalsIgnoreCase("Star")) {
										chessPieceType="Cross";
									}
									if (((String)button[i].getClientProperty("pieceType")).equalsIgnoreCase("Cross")) {
										chessPieceType="Star";
									}
									holder=2;
								}
								removePieceModel.removePiece(i);
								
								changePieceModel.setChangePiece(holder,chessPieceType,i);
							}
						}
						afterRounds=0;
					} //end 4 turn change
					
					
	}
	
	public int getRounds() {
		
		return afterRounds;
	}
}
