
public class WholeItem extends Item
{
    private float pricePerUnit;
    
    public WholeItem(String name, int refID, float VAT, float pricePerUnit)
    {
        super(name, refID, VAT);
        this.pricePerUnit = pricePerUnit;
    }
    
    public float getPriceBeforeTax()
    {
        return pricePerUnit;
    }
    
    public float getPriceAfterTax()
    {
        return pricePerUnit - pricePerUnit * VAT;
    }
    
    public void print()
    {
        super.print();
        System.out.println( "price before tax: " + getPriceBeforeTax() );
        System.out.println( "price after tax: " + getPriceAfterTax() );
    }
}
