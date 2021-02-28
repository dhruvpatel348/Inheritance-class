public class Circle extends Point
{
	protected double radius;

	public Circle()
	{
		super();
		radius = 0.00;
	}
	public Circle(double x, double y, double r)
	{
		super(x,y);
		radius = r;
	}
	public void setCircle(double x, double y, double r)
	{
		super.setPoint(x,y);
		if(r>=0) radius = r;
		else radius = 0;
	}
	public double getRadius()
	{
		return radius;
	}
	public String toString()
	{
		return(super.toString() + ",radius:" + radius);
	}
	public boolean equals(Circle otherCircle)
	{
		return(super.equals(otherCircle)&&radius == otherCircle.radius);
	}
	public void makeCopy(Circle otherCircle)
	{
		super.makeCopy(otherCircle);
		radius = otherCircle.radius;
	}
	public Circle getCopy()
	{
		Circle temp = new Circle();
		temp.makeCopy(this);
		return temp;
	}

	public double area()
	{
		return (Math.PI * Math.pow(radius,2));
	}
	public double circumference()
	{
		return (2 * Math.PI * radius);
	}
	public void printCircle()
	{
		printPoint();
		System.out.print(",radius:" + radius);
	}

}