public class PersonTester
{
    public static void main(String[] args)
    {
        Person a = new Person("Tracy", "Zhou", "TracyZ14@nycstudents.net");

        System.out.println("EXPECTED RESULT : Hello, my name is Tracy Zhou.");
        System.out.print("ACTUAL RESULT   : ");
        a.introduce();

        System.out.println("EXPECTED RESULT : Tracy");
        System.out.println("ACTUAL RESULT   : " + a.getFirstName());

        System.out.println("EXPECTED RESULT : Zhou");
        System.out.println("ACTUAL RESULT   : " + a.getLastName());

        System.out.println("EXPECTED RESULT : TracyZ14@nycstudents.net");
        System.out.println("ACTUAL RESULT   : " + a.getEmailAddress());

        a.updateEmailAddress("tzhou8107@bths.edu");
        System.out.println("EXPECTED RESULT : tzhou8107@bths.edu");
        System.out.println("ACTUAL RESULT   : " + a.getEmailAddress());
    }
}