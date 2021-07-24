
//Nicholas Wong Tian Shun
public class StarModel implements ChessPieces{
	
	@Override
	public boolean ValidMove(String pieceType, int initPos, int finalPos) {
		
	      if (pieceType.equalsIgnoreCase("Star")) {
	    	  
	          int steps = finalPos - initPos;
	          steps = Math.abs(steps);
	          
	          if(steps == 5 || steps == 10) {
	              return true;
	          }

	          if( steps == 1 || steps == 2) {
	              return true;
	          }
	      }

	      
		  return false;
	}
}
