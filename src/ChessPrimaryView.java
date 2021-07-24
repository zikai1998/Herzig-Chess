import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

//JIMMY LIM JUN BING 
public class ChessPrimaryView{

	private ChangePieceModel changePieceModel;
	String chessPieceType = " ";
	int holder=0;
	int afterNumber=0;
	
	//Components
	
	JButton[] button = new JButton[40];
	JFrame frame = new JFrame ("Herzig Chess");
	JMenu menu = new JMenu("MENU");
	JMenuBar menubar = new JMenuBar();
	JMenuItem saveMenu = new JMenuItem("SAVE");
	JMenuItem loadMenu = new JMenuItem("LOAD");
	
	
	//constructor 
	public ChessPrimaryView(){
		
		menu.add(saveMenu);	
		menu.add(loadMenu);
		menubar.add(menu);
		//Create Model for set the current player button color
		CheckCurrentPlayerModel checkCurrentModel = new CheckCurrentPlayerModel(button);
		
		// Create Controller for save and load button
		ChessMenuSaveController saveController = new ChessMenuSaveController(button);
		saveMenu.addActionListener(saveController);

		
		for (int number=0;number<40;number++) {							
			button[number] = new JButton();
			button[number].putClientProperty("buttonNumber", number);
			button[number].setBackground(Color.white);
			button[number].setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
			
			// Create model
			ChessButtonModel boardModel = new ChessButtonModel(button, number);
			boardModel.setBoard();
			
			ResetBoardModel resetBoardModel = new ResetBoardModel(button);
			ChangePieceModel changePieceModel = new ChangePieceModel(button, chessPieceType,  holder,  afterNumber);
			RemovePieceModel removePieceModel = new RemovePieceModel(button);
			MovePieceModel movePieceModel = new MovePieceModel(button, chessPieceType, holder, afterNumber);
			FlipModel flipModel = new FlipModel(button,changePieceModel, removePieceModel);
			RoundModel roundModel = new RoundModel(button, removePieceModel, changePieceModel);
			ChessPrimaryModel primaryModel = new ChessPrimaryModel(button,resetBoardModel, 
			changePieceModel, removePieceModel, movePieceModel, flipModel, roundModel ) ;
			
			// Create chess piece controller
			ChessPrimaryController chessController = new ChessPrimaryController(button, checkCurrentModel, primaryModel);
			button[number].addMouseListener(chessController);
	
			frame.add(button[number]);	
		}
		
		frame.setSize(800,800);
		frame.setLayout(new GridLayout(8,5));
		frame.setJMenuBar(menubar);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
		frame.setResizable(true);		
	}

} 

