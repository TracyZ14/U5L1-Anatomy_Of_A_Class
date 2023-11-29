public class Spinner
{
    private int numberOfSections;
    private int mostRecentSpinValue;
    private int timesSpun;
    private int sumOfAllSpins;

    public Spinner(int numberOfSections)
    {
        this.numberOfSections = numberOfSections;
        int mostRecentSpinValue = 0;
        int timesSpun = 0;
        int sumOfAllSpins = 0;
    }

    public void spin()
    {
        mostRecentSpinValue = (int) (1 + Math.random() * numberOfSections);
        timesSpun++;
        sumOfAllSpins = sumOfAllSpins + mostRecentSpinValue;
    }

    public int getMostRecentSpinValue()
    {
        return mostRecentSpinValue;
    }

    public double getAverageSpinValue()
    {
        double average = (double) sumOfAllSpins / timesSpun;
        return average;
    }
}