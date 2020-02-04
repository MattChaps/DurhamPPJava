
/**
 * Write a description of class Calculation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculation
{
   private int x;
   private int y;
   
   public Calculation(int x, int y) {
      this.x=x;
      this.y=y;
   }   

    public int getX()
    {
       return x;
    }    
    
    public void setX(int x)
    {
        this.x=x;
    }
    
    
    public int getHoursWeek()
    {
       return 7*24;
    }
    
    public int getSecondsYear()
    {
        Calculation c = new Calculation(1,2);
        return c.getHoursWeek()*360*52;
    }
    
    public double avgxy()
    {
        return (x+y)/2;
    }
    
    public int maxxy()
    {
        if (x > y) 
        {
            return x;
        }
        else 
        {
        return y;
        }
   
   }
    
   public void swapxy()
    {
        int temp = x;
        x = y;
        y = temp;
    }
    
    public double rootsxy(int a, int b, int c)
    {
        return (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
    }

    public boolean xIsOdd()
    {
        return x % 2 == 1;
    }
    
    public void xmonthyyear(String str)
    {
         String[] parts = str.split("/");
         x = Integer.valueOf(parts[0]);
         y = Integer.valueOf(parts[1]);
    }
    
    public String coins()
    {
        return Integer.toString(x*100) + "p";
    }
}

       
