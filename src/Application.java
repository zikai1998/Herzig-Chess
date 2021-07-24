import javax.swing.*;

//Law Wai Seng
public class Application{
	
	public static void main(String args[]) {
		
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					try {
						createAndShowGUI();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		public static void createAndShowGUI() throws Exception {
			
			//Initial Value
			JButton button[] = new JButton[40];
			int number = 0;
			String chessPieceType = "";
			int holder=0;
			int afterNumber=0;

			CheckCurrentPlayerModel checkCurrentModel = new CheckCurrentPlayerModel(button);
			ChangePieceModel changePieceModel = new ChangePieceModel(button, chessPieceType,  holder,  afterNumber);
			RemovePieceModel removePieceModel = new RemovePieceModel(button);
			ChessButtonModel model = new ChessButtonModel(button, number);
			ResetBoardModel resetBoardModel = new ResetBoardModel(button);
			MovePieceModel movePieceModel = new MovePieceModel(button, chessPieceType, holder, afterNumber);
			FlipModel flipModel = new FlipModel(button,changePieceModel, removePieceModel);
			RoundModel roundModel = new RoundModel(button, removePieceModel, changePieceModel);
			ChessPrimaryModel primaryModel = new ChessPrimaryModel(button, resetBoardModel, 
					changePieceModel, removePieceModel, movePieceModel, flipModel, roundModel) ;
			ChessPrimaryView view = new ChessPrimaryView();
			ChessPrimaryController controller = new ChessPrimaryController(button, checkCurrentModel,primaryModel);
		}
	
}
