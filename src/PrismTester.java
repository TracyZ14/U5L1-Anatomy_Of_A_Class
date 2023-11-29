public class PrismTester
{
    public static void main(String[] args)
    {
        Prism a = new Prism(1, 2, 3);

        System.out.println("EXPECTED RESULT : Length: 1, Width: 2, Height: 3");
        System.out.println("ACTUAL RESULT   : " + a.toString());

        a.updateLength(4);
        System.out.println("EXPECTED RESULT : Length: 4, Width: 2, Height: 3");
        System.out.println("ACTUAL RESULT   : " + a.toString());

        a.updateWidth(5);
        System.out.println("EXPECTED RESULT : Length: 4, Width: 5, Height: 3");
        System.out.println("ACTUAL RESULT   : " + a.toString());

        a.updateHeight(6);
        System.out.println("EXPECTED RESULT : Length: 4, Width: 5, Height: 6");
        System.out.println("ACTUAL RESULT   : " + a.toString());

        System.out.println("EXPECTED RESULT : 120");
        System.out.println("ACTUAL RESULT   : " + a.getVolume());

        System.out.println("EXPECTED RESULT : 148");
        System.out.println("ACTUAL RESULT   : " + a.getSurfaceArea());
    }
}