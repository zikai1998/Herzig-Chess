
import java.awt.event.*;
import javax.swing.*;

//Lim Zi Kai
public class ChessPrimaryModel {
	
	private PlayerModel player = new PlayerModel();

	private JButton button[] = new JButton[40];

	String pieceType;
	int pieceHolder,buttonNumber;
	private static int rounds;
	int holder;
	String chessPieceType;
	int endPiece=0;
	
	//Nicholas Wong Tian Shun
	//Factory Pattern
	PieceFactory Factory = new PieceFactory();
	ChessPieces arrowBox = Factory.getPiece("ArrowBox");
	ChessPieces star = Factory.getPiece("Star");
	ChessPieces cross = Factory.getPiece("Cross");
	ChessPieces heart = Factory.getPiece("Heart");

	private ResetBoardModel resetBoardModel;
	private ChangePieceModel changePieceModel;
	private RemovePieceModel removePieceModel;
	private MovePieceModel movePieceModel;
	private FlipModel flipModel;
	private RoundModel roundModel;

	//Constructor
	public ChessPrimaryModel(JButton[] button,
			ResetBoardModel resetBoardModel, ChangePieceModel changePieceModel, RemovePieceModel removePieceModel,
			MovePieceModel movePieceModel, FlipModel flipModel, RoundModel roundModel){
	
		this.button = button;
		this.resetBoardModel = resetBoardModel;
		this.changePieceModel = changePieceModel;
		this.removePieceModel = removePieceModel;
		this.movePieceModel = movePieceModel;
		this.flipModel = flipModel;
		this.roundModel = roundModel;

	}
	
	public void primaryOperationModel(MouseEvent e) {

		JButton buttonClicked = (JButton)e.getSource();
		// 0 - 39 button
		buttonNumber = (int) buttonClicked.getClientProperty("buttonNumber"); 
		// 0 = empty, 1 = red, 2 = green
		pieceHolder = (int) buttonClicked.getClientProperty("pieceHolder");
		// ArrowBox = arrowBox, Star = star, Cross = cross, Heart = heart
		pieceType = (String) buttonClicked.getClientProperty("pieceType");
		//Testing button clicked valid
		/*
		System.out.println(pieceHolder+ " "+pieceType+" "+buttonNumber +" "+player.getPlayerType());
		*/	
		// if no chosen chess piece
				if (player.checkInitPos() == false) { // initial = false
					if (player.currentPlayerType(pieceHolder)) { //player type = piece holder =1
						player.setInitPos(buttonNumber); 
						player.setPieceType(pieceType); 
						
						//Test setting valid
						/*
						System.out.println(player.getInitPos()+ " "+player.getPieceType()+" "); 
						*/
					}
				}else {
					// check player type ?= piece holder
					if (!player.currentPlayerType(pieceHolder)) {
						
						//if the initial selected class piece is arrow box
						if(player.getPieceType().equalsIgnoreCase("ArrowBox")) {
							if (arrowBox.ValidMove(player.getPieceType(), player.getInitPos(), buttonNumber)) {
								
								//remove initial chess piece button
								removePieceModel.removePiece(player.getInitPos());
								
								//check if the button clicked is opposite
								if (!player.currentPlayerType(pieceHolder)) {
									//remove enemy chess
									removePieceModel.removePiece(buttonNumber);
									
									//if the opposite is Heart
									if (pieceType.equalsIgnoreCase("Heart")){
										player.gameOver();
										resetBoardModel.resetBoard();
										//reset rounds and flip to 0
										rounds=0;
										
									}else {
										// place the initial chess piece to target button
										movePieceModel.movePiece(player.getPlayerType(),player.getPieceType(), buttonNumber);
										//RESET
										player.initial();
										player.changePlayer();
										// move and flip are counted
										rounds=rounds+1;
										roundModel.round(rounds);
										rounds=roundModel.getRounds();
										flipModel.flip();
									}
								}	
							}	
						} //end piece type 1
						
						//if the initial selected class piece is star
						if(player.getPieceType().equalsIgnoreCase("Star")) {
							if (star.ValidMove(player.getPieceType(), player.getInitPos(), buttonNumber)) {
			
								removePieceModel.removePiece(player.getInitPos());
								
								//check if the button clicked is opposite
								if (!player.currentPlayerType(pieceHolder)) {
									//remove enemy chess
									removePieceModel.removePiece(buttonNumber);
									
									//if the opposite is Heart
									if (pieceType.equalsIgnoreCase("Heart")){
										player.gameOver();
										resetBoardModel.resetBoard();
										//reset rounds and flip to 0
										rounds=0;
										
									}else {
										// place the initial chess to target button
										movePieceModel.movePiece(player.getPlayerType(),player.getPieceType(), buttonNumber);
										//RESET
										player.initial();
										player.changePlayer();
										// move and flip are counted
										rounds=rounds+1;
										roundModel.round(rounds);
										rounds=roundModel.getRounds();
										flipModel.flip();
									}
								}	
							}	
						} //end piece type 2
					
						//if the initial selected class piece is cross
						if(player.getPieceType().equalsIgnoreCase("Cross")) {
							if (cross.ValidMove(player.getPieceType(), player.getInitPos(), buttonNumber)) {
								removePieceModel.removePiece(player.getInitPos());
								//check if the button clicked is opposite
								if (!player.currentPlayerType(pieceHolder)) {
									//remove enemy chess
									removePieceModel.removePiece(buttonNumber);
									//if the opposite is Heart
									if (pieceType.equalsIgnoreCase("Heart")){
										player.gameOver();
										resetBoardModel.resetBoard();
										//reset rounds and flip to 0
										rounds=0;	
									}else {
										// place the initial chess to target button
										movePieceModel.movePiece(player.getPlayerType(),player.getPieceType(), buttonNumber);
										//RESET
										player.initial();
										player.changePlayer();
										// move and flip are counted
										rounds=rounds+1;
										roundModel.round(rounds);
										rounds=roundModel.getRounds();
										flipModel.flip();
									}
								}	
							}	
						} //end piece type 3
						//if the initial selected class piece is heart
						if(player.getPieceType().equalsIgnoreCase("Heart")) {
							if (heart.ValidMove(player.getPieceType(), player.getInitPos(), buttonNumber)) {
								removePieceModel.removePiece(player.getInitPos());
								
								//check if the button clicked is opposite
								if (!player.currentPlayerType(pieceHolder)) {
									//remove enemy chess
									removePieceModel.removePiece(buttonNumber);
									
									//if the opposite is Heart
									if (pieceType.equalsIgnoreCase("Heart")){
										player.gameOver();
										resetBoardModel.resetBoard();
										//reset rounds and flip to 0
										rounds=0;	
									}else {
										// place the initial chess to target button
										movePieceModel.movePiece(player.getPlayerType(),player.getPieceType(), buttonNumber);
										//RESET
										player.initial();
										player.changePlayer();
										// move and flip are counted
										rounds=rounds+1;
										roundModel.round(rounds);
										rounds=roundModel.getRounds();
										flipModel.flip();
									}
								}	
							}	
						} //end piece type 4
						//Testing 4 rounds change
						/*
						System.out.println(rounds);
						*/
					}// end if move to valid button
					else {
						// if move to chess piece holder = player type
						player.initial();	
					}	
				}//end if chosen chess piece 
	}
}
