
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
    private String height;
    private String weight;
    private String social;
    private String address;
    private String phoneNum;
    private String dob;

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
        height = height1 + " inches";
    }
    
    public void inputWeight(double weight1)
    {
        weight = weight1 + " lbs";
    }
    
    public void inputSocial(int soc1,int soc2,int soc3)
    {
        if (100 > soc1 || soc1 > 999)
        {
            System.err.println("Invalid number for field 1. Input 3 digits.");
        }
        else if (10 > soc2 || soc2 > 99)
        {
            System.err.println("Invalid number for field 2. Input 2 digits.");
        }
        else if (1000 > soc3 || soc3 > 9999)
        {
            System.err.println("Invalid number for field 3. Input 4 digits.");
        }
        else 
        {
            social = soc1 + "-" + soc2 + "-" + soc3;
        }
    }
    
    public void inputAddress(String newAdd)
    {
        address = newAdd;
    }
    
    public void inputPhone(int areaCode, int numBegin, int numEnd)
    {
        if (100 > areaCode || areaCode > 999)
        {
            System.err.println("Invalid number for field 1. Input 3 digits.");
        }
        else if (100 > numBegin || numBegin > 999)
        {
            System.err.println("Invalid number for field 2. Input 3 digits.");
        }
        else if (1000 > numEnd || numEnd > 9999)
        {
            System.err.println("Invalid number for field 3. Input 4 digits.");
        }
        else 
        {
            phoneNum = areaCode + "-" + numBegin + "-" + numEnd;
        }
    }
    
    public void inputDOB(int month, int day, int year)
    {
        if (1 > month || month > 12)
        {
            System.err.println("Invalid number for field 1. Input the number corresponding to a month.");
        }
        else if (1 > day || day > 31)
        {
            System.err.println("Invalid number for field 2. Input the number corresponding to a day.");
        }
        else if (1000 > year || year > 2100)
        {
            System.err.println("Invalid number for field 3. Input the number corresponding to a year.");
        }
        else 
        {
            dob = month + "/" + day + "/" + year;
        }
    }
    
    public void showInfo()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(social);
        System.out.println(address);
        System.out.println(phoneNum);
        System.out.println(dob);
    }
}