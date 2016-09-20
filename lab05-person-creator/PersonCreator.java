
// Creates a person that you can input values for describing the person.

public class PersonCreator
{
    //The name of the person.
    private String name;
    // The age of the person.
    private int age;
    // The sex of the person.
    private String sex;
    // The height of the person.
    private String height;
    // The weight of the person.
    private String weight;
    // The social security number of the person.
    private String social;
    // The address of the person.
    private String address;
    // The phone number of the person.
    private String phoneNum;
    // The date of birth of the person.
    private String dob;

    // Creates the instance of a person and records their name.
    public PersonCreator(String first, String last)
    {
    name = first + " " + last;
    }
    
    // Inputs the person's age.
    public void inputAge(int age1)
    {
        age = age1;
    }
    
    // Inputs the sex of the person.
    public void inputSex (String sex1)
    {
        sex = sex1;
    }
    
    // Input's the height of the person.
    public void inputHeight(double height1)
    {
        height = height1 + " inches";
    }
    
    // Inputs the weight of the person.
    public void inputWeight(double weight1)
    {
        weight = weight1 + " lbs";
    }
    
    // Inputs the social security number of the person using 3 integers.
    // Needs to be input as a 3 digit number, then a 2 digit number, then a 4 digit number.
    // Fails if not input in this way.
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
    
    // Inputs the address of the person.
    public void inputAddress(String newAdd)
    {
        address = newAdd;
    }
    
    // Inputs the phone number of the person in 3 integers.
    // Needs to be input as a 3 digit number, then a 3 digit number, then a 4 digit number.
    // Fails if not input in this way.
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
    
    // Inputs the date of birth of the person.
    // Inputs for month are 1-12 corresponding to months of the year.
    // Inputs for day are 1-31.
    // Inputs for year are 1000-2100.
    // Any other inputs will fail.
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
    
    // Shows all the currently collected info of this instance of person.
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
