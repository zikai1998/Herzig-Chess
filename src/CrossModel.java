
//Nicholas Wong Tian Shun
public class CrossModel implements ChessPieces{
	
	@Override
	public boolean ValidMove(String pieceType, int initPos, int finalPos) {
		
	      if (pieceType.equalsIgnoreCase("Cross")) {
	    	  
	          int steps = finalPos - initPos;
	          // prevent negative values
	          steps = Math.abs(steps);
	          
	          if (steps == 4 || steps == 6) {
	              return true;
	          } 
	      }

		  return false;
	}
}
 