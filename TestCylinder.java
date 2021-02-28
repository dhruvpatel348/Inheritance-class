import java.util.Scanner;
public class TestCylinder
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		Cylinder myCylinder = new Cylinder(5.00,4.00,7.23,2.30);
		Cylinder yourCylinder = new Cylinder();

		System.out.println("Initialise myCylinder, myCylinder: " + myCylinder);
		System.out.println("Initialise myCylinder, myCylinder: " + yourCylinder);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		yourCylinder.setCylinder(5.00,45.00,82.20,2.80);
		System.out.println("After setting yourCylinder, yourCylinder: " + yourCylinder);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.printf("Surface area of yourCylinder is %8.2f\n",yourCylinder.surfaceArea());
		System.out.printf("Volume of yourCylinder is %-6.2f\n",yourCylinder.volume());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		if(myCylinder.equals(yourCylinder)) System.out.println("The two cylinders are equal");
		else System.out.println("The two cylinders are not equal");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Enter the x point:");
		double x = keyboard.nextDouble();

		System.out.print("Enter the y point:");
		double y = keyboard.nextDouble();

		System.out.print("radius:");
		double radius = keyboard.nextDouble();

		System.out.print("height:");
		double height = keyboard.nextDouble();

		myCylinder.setCylinder(x,y,radius,height);
		System.out.println("After setting myCylinder, myCylinder: " + myCylinder);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		yourCylinder = myCylinder.getCopy();
		//yourCylinder.makeCopy(myCylinder);
		System.out.println("After copying myCylinder into yourCylinder, yourCylinder: " + yourCylinder);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
}
