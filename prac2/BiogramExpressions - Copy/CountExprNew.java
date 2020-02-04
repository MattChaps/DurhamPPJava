
/**
 * A new simpel class similar to CountExpr to apply a transformation iteratively 
 * 
 * @author Matthew Chapman 
 * 
 */
public class CountExprNew
{
    private double x;
    private double y;

    /**
     * Constructor for objects of class CountExprNew
     */
    public CountExprNew(int x0, int y0)
    {
        // initialise instance variables
        x = x0;
        y = y0;
    }

    /**
     * Transformation method
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void doOnce()
    {
        y = y + Math.sin(x);
        x = x - Math.cos(y);
    }
    
    public boolean finished() {
        return x+y>100;
    }
}
