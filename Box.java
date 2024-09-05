public class Box{
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    public double volume()
    {
        return width*height*depth;
    }
    public static void main(String[] args)
    {
    Box box=new Box(3,4,5);
    System.out.println(box.width);
    System.out.println(box.volume());

    }
}


