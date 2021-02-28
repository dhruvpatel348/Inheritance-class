public class ExtClock extends Clock
{
	public static String[] arrZone = {"EST","CST","MST","PST","EDT","CDT","MDT","PDT"};

	protected String zone;

    public ExtClock()
    {
		super();
		zone = " ";
	}
	public ExtClock(int hours, int minutes, int seconds, int k)
	{
		super(hours,minutes,seconds);
		zone = arrZone[k];
	}
	public void setZone(int hours, int minutes, int seconds)
	{
		setTime(hours,minutes,seconds);
	}
	public void setZone(int hours, int minutes, int seconds, int k)
	{
		setTime(hours,minutes,seconds);
		zone = arrZone[k];
	}
	public String getZone()
	{
		return zone;
	}
	public String toString()
	{
		return (super.toString() + " " + zone);
	}
	public void incrementSeconds()
	{
		super.incrementSeconds();
	}
	public void incrementMinutes()
	{
		super.incrementMinutes();
	}
	public void incrementHours()
	{
		super.incrementHours();
	}
	public boolean equals(ExtClock otherClock)
	{
		return(super.equals(otherClock)&&zone == otherClock.zone);
	}
	public void makeCopy(ExtClock otherClock)
	{
		super.makeCopy(otherClock);
		zone = otherClock.zone;
	}
	public ExtClock getCopy()
	{
		ExtClock temp = new ExtClock();
		temp.makeCopy(this);
		return temp;
	}

	public void printTime()
	{
		super.printTime();
		System.out.println(" " + zone);
	}
}
