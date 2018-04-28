package frogjump;
public class Frog {

    public static int jump(int currentPosition, int maximumLength, int lengthOfJump){
        
      return Double.valueOf(Math.ceil((maximumLength - currentPosition) / (double) lengthOfJump)).intValue(); 
    }
    
}
