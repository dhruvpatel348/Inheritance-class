public class Point
{
	protected double x;
	protected double y;

	public Point()
	{
		x = 0.00;
		y = 0.00;
	}
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
    }
    public void setPoint(double x, double y)
    {
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return("(" + x + "," + y + ")");
	}
	public boolean equals(Point otherPoint)
	{
		return(x == otherPoint.x && y == otherPoint.y);
	}
	public void makeCopy(Point otherPoint)
	{
		x = otherPoint.x;
		y = otherPoint.y;
	}
	public Point getCopy()
	{
		Point temp = new Point();
		temp.x = x;
		temp.y = y;
		return temp;
	}

	public void printPoint()
	{
		System.out.print("(" + x + "," + y + ")");
	}


}