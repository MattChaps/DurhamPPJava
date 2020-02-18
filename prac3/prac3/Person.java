
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int age;
    private String eye_colour;
  

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int age, String eye_colour)
    {
        this.name = name;
        this.age = age;
        this.eye_colour = eye_colour;
    }

    
    public String toString(){
        return "My name is " + name + ", I am " + age + " years old, and I have " + eye_colour + " eyes.";
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}
