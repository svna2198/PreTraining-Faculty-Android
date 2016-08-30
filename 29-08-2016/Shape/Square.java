public class Square extends Rectangle
{
	public Square()
	{
		System.out.println("Default constructor of Square class");
	}
	public Square(double side)
	{
		super(side,side);
	}
	public Square(double side,String color,boolean filled)
	{
		setColor(color);
                setFilled(filled);
		
	}
	public double getSide()
	{
		return width;
	}
	public void setSide(double side)
	{
		width=side;
	}
	public void setWidth(double side)
	{
		super.width=side;
	}
	public void setLength(double side)
	{
		super.length=side;
	}
	public double getArea()
	{	
		return getWidth()*getWidth();
	}
	public double getPerimeter()
	{
		return 4*getWidth();
	}
	public String toString()
	{
	    String s="Area of Square:"+getArea();	
            s=s+"\nPerimeter of the Square:"+getPerimeter();
            s=s+"\nColor..."+getColor();
            s=s+",isFilled..."+isFilled();
            return s;	
         
	}
}