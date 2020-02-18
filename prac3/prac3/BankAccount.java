import java.util.ArrayList;

public class BankAccount
{
    private int account_number;
    private ArrayList<Integer> transactions;
    private Person person;
    
    public BankAccount(int account_number, Person person)
    {
        this.account_number = account_number;
        transactions = new ArrayList<Integer>();
        this.person = person;
    }

    public void make_transaction(int x)
    {
        transactions.add(x);
    }
    
    public ArrayList<Integer> view_transaction()
    {
        return transactions;
    }

}
