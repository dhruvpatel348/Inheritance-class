public class TestPoint
{
	public static void main(String[]args)
	{
		Point myPoint = new Point(5.00,4.00);
		Point yourPoint = new Point();

		System.out.println("Initial yourPoint:" + yourPoint);
		System.out.println("Initial myPoint:" + myPoint);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		yourPoint.setPoint(5.00,45.00);
		System.out.println("After setting yourPoint, yourPoint:" + yourPoint);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		if(myPoint.equals(yourPoint)) System.out.println("The two points are equal");
		else System.out.println("The two points are not equal");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		myPoint.setPoint(6.00,9.00);
		System.out.println("After setting myPoint, myPoint:" + myPoint);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        yourPoint = myPoint.getCopy();
  		//yourPoint.makeCopy(myPoint);
		System.out.println("After copying myPoint into yourPoint, yourPoint:" + yourPoint);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
}