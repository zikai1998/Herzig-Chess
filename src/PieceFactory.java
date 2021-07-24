
//Nicholas Wong Tian Shun
//Factory Pattern
public class PieceFactory {
	
	//use getPiece method to get object of type piece 
	public ChessPieces getPiece (String pieceType) {
	
		if(pieceType == null) {
			return null;
		}
		else if (pieceType.equalsIgnoreCase("ArrowBox")) {
			return new ArrowBoxModel();
		}
		else if (pieceType.equalsIgnoreCase("Star")) {
			return new StarModel();
		}
		else if (pieceType.equalsIgnoreCase("Cross")) {
			return new CrossModel();
		}
		else if (pieceType.equalsIgnoreCase("Heart")) {
			return new HeartModel();
		}
		
		return null; 
	}

}
