interface Shape {
    double area();
    double perimeter();
}
class Rectangle implements Shape 
{
    private double length;
    private double width;
    public Rectangle(double length, double width) 
	{
        this.length = length;
        this.width = width;
    }
    public double area() 
	{
        return length * width;
    }
    public double perimeter()
	{
        return 2 * (length + width);
    }
}
 class TestMain
 {
    public static void main(String[] args) 
	{
        Rectangle rectangle = new Rectangle(5, 3);
		
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}