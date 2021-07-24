//Nicholas  Wong Tian Shun
public class HeartModel implements ChessPieces{
	
	@Override
	public boolean ValidMove(String pieceType, int initPos, int finalPos) {
		
	      if (pieceType.equalsIgnoreCase("Heart")) {
	    	  
	          int steps = finalPos - initPos;
	          
	          // prevent negative values
	          steps = Math.abs(steps);
	          
	          if (steps == 1 || steps == 5 || steps == 4 || steps == 6 ) {
	              return true;
	          } 
	      }

		  return false;
	}
}