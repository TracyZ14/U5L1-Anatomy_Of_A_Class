public class Person
{
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Person(String firstName, String lastName, String emailAddress)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public void introduce()
    {
        System.out.println("Hello, my name is " + firstName + " " + lastName + ".");
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void updateEmailAddress(String newEmailAddress)
    {
        this.emailAddress = newEmailAddress;
    }
}