import java.util.ArrayList;

public class Website
{
   private ArrayList<Item> items;

    public Website()
    {
        items = new ArrayList<Item>();
    }
    
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }
    
    public void list()
    {
        for(Item item : items) {
            item.print();
            System.out.println();   // empty line between items
        }
    }
    
    public void createDatabase()
    {
        WholeItem item;
        
        item = new WholeItem("phone", 1, 0.05f, 400);
        this.addItem(item);
        
        item = new WholeItem("tablet", 2, 0.07f, 800);
        this.addItem(item);
    }
    
}
