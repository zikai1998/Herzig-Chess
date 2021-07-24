
//Nicholas Wong Tian Shun
public class ArrowBoxModel implements ChessPieces{
	
	@Override
	public boolean ValidMove(String pieceType, int initPos, int finalPos) {
		 
	      if (pieceType.equalsIgnoreCase("ArrowBox")) {
	    	  int steps = finalPos - initPos;
	          // prevent negative values
	          steps = Math.abs(steps);

	          if (steps == 5|| steps == 10 ) {
	              return true;
	          }   		     
	      }	
		  return false;
	}
}
