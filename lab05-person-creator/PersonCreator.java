
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Your class begins here!
    private String name;
    private int age;
    private String sex;
    private double height;
    private double weight;
    private String social;
    private String address;
    private int phoneNum;
    private int dob;

    public PersonCreator(String first, String last)
    {
    name = first + " " + last;
}

    public void showName()
    {
        System.out.println(name); 
    }
    
    public void inputAge(int age1)
    {
        age = age1;
    }
    
    public void inputSex (String sex1)
    {
        sex = sex1;
    }
    
    public void inputHeight(double height1)
    {
        height = height1;
    }
    
    public void inputWeight(double weight1)
    {
        weight1=weight;
    }
    
    public void inputSocial(int soc1,int soc2,int soc3)
    {
        if (100 <= soc1 && soc1 <= 999){
            return ;
        } else {
            System.err.println("Invalid number for field 1. Input 3 digits.");
        }
        if (10 <= soc2 && soc2 <= 99){
            return ;
        } else {
            System.err.println("Invalid number for field 2. Input 2 digits.");
        }
        if (1000 <= soc3 && soc3 <= 9999){
            return ;
        } else {
            System.err.println("Invalid number for field 3. Input 4 digits. ");
        }
        
        social = soc1 + "-" + soc2 + "-" + soc3;
    }
}