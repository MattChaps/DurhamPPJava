public class VideoGame extends Item
{
    private String developer;
    
    public VideoGame(String theTitle, String theDeveloper)
    {
        super(theTitle);
        developer = theDeveloper;
    }
    
    public void print()
    {
        super.print();
        System.out.println("developer: " + developer );
    }
}
