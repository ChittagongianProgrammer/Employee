
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee
{
    // The age of the employee
    private int age;
    // The number of days holiday the employee is entitled to
    private int numHolidays;
    // The name of this employee
    private String name;
    // The payscale of this employee
    private int payscale;
    private Employee emp1;
    private Employee emp2;
    /**
     * Constructor for objects of class Employee
     */
    public Employee(String givenName, int givenAge)
    {
        name = givenName;
        age = givenAge;
        numHolidays = 10;
        payscale = 1;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getNumHolidays() {
        return numHolidays;
    }
    
    public int getPayscale(){
        return payscale;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setNumHolidays(int updatedHolidays) {
        this.numHolidays = updatedHolidays;
    }
    
    public void promote(){
        this.payscale = payscale + 1;
    }
    
    public void increaseAge(){
        this.age = age + 1;
    }
    
    public void swap(){
        Employee emp;
        emp = emp1;
        emp1 = emp2;
        emp2 = emp;
        }
    }
