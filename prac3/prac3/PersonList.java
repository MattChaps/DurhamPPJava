import java.util.ArrayList;

public class PersonList
{
    private ArrayList<Person> people;
   
    public PersonList()
    {
        people = new ArrayList<Person>();
    }

    public void add_person(Person person)
    {
        people.add(person);
    }
    
    public ArrayList<Person> view_people()
    {
        return people;
    }
    
    public int name_oldest()
    {
        return people.get(0).getAge();
    }
}


