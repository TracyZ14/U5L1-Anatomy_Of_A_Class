public class SpinnerTester
{
    public static void main(String[] args)
    {
        Spinner a = new Spinner(5);

        for(int i = 0; i < 10; i++)
        {
            a.spin();

            System.out.println("EXPECTED RESULT : [random number between 1 - 5, inclusive]");
            System.out.println("ACTUAL RESULT   : " + a.getMostRecentSpinValue());

            System.out.println("EXPECTED RESULT : [the average of all the previous random numbers]");
            System.out.println("ACTUAL RESULT   : " + a.getAverageSpinValue());
        }
    }
}