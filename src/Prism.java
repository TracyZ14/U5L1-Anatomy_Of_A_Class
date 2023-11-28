public class Prism
{
    private int length;
    private int width;
    private int height;

    public Prism(int length, int width, int height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void updateLength(int newLength)
    {
        this.length = newLength;
    }

    public void updateWidth(int newWidth)
    {
        this.width = newWidth;
    }

    public void updateHeight(int newHeight)
    {
        this.height = newHeight;
    }

    public String toString()
    {
        return("Length: " + Integer.toString(length) + ", Width: " + Integer.toString(width) + ", Height: " + Integer.toString(height));
    }

    public int getVolume()
    {
        int volume = length * width * height;
        return volume;
    }

    public int getSurfaceArea()
    {
        int surfaceArea = 2 * ((length * width) + (length * height) + (width * height));
        return surfaceArea;
    }
}