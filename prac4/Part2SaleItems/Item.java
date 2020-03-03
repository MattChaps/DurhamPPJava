public class Item
{
    private String name;
    private int refID;
    public float VAT;
    private String description;
    
    public Item(String name, int refID, float VAT)
    {
        this.name = name;
        this.refID = refID;
        this.VAT = VAT;
        description = "";
    }
    
    public void print()
    {
        System.out.println("name: " + name + " (reference ID: " + refID + ")");
        System.out.println("description:" + description);
    }
}
