public class Cylinder extends Circle
{
	protected double height;

	public Cylinder()
	{
		super();
		height = 0.00;
	}
	public Cylinder(double x, double y, double r, double h)
	{
		super(x,y,r);
		height = h;
	}
	public void setCylinder(double x, double y, double r, double h)
	{
		setCircle(x,y,r);
		if(height >= 0)height = h;
		else height = 0;
	}
	public double getHeight()
	{
		return height;
	}
	public String toString()
	{
		return("Center:" + super.toString() + ",height:" + height);
	}
	public boolean equals(Cylinder otherCylinder)
	{

		return(super.equals(otherCylinder)&&radius == otherCylinder.height);
	}
	public void makeCopy(Cylinder otherCylinder)
	{
		super.makeCopy(otherCylinder);
		height = otherCylinder.height;
	}
	public Cylinder getCopy()
	{
		Cylinder temp = new Cylinder();
		temp.makeCopy(this);
		return temp;
	}

	public double surfaceArea()
	{
		return ((2 * area()) + (circumference() * height));
	}

	public double volume()
	{
		return (area() * height);
	}

	public void printCylinder()
	{
		printCircle();
		System.out.print(",height:" + height);

	}
}
