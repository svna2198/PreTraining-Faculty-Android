public class Circle extends Shape
{
	protected double radius;
	public Circle()
	{
		System.out.println("default constructor for Circle Class");
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{	
		return Math.PI*radius*radius;
	}
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
	public String toString()
	{
		return "Area of the circle:"+getArea()+"\n Perimeter of the circle:"+getPerimeter();
	}
}