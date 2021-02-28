import java.util.Scanner;
public class TestCircle
{
	public static void main(String[]args)
	{
		Scanner keyboard  = new Scanner(System.in);
		Circle myCircle = new Circle(5.00,4.00,7.23);
		Circle yourCircle = new Circle();

		System.out.println("Initialise myCircle, myCircle: " + myCircle);
		System.out.println("Initialise myCircle, myCircle: " + yourCircle);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		yourCircle.setCircle(5.00,45.00,82.20);
		System.out.println("After setting yourCircle, yourCircle: " + yourCircle);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.printf("Area of yourCircle is %8.2f\n",yourCircle.area());
		System.out.printf("Circumference of yourCircle is %-6.2f\n",yourCircle.circumference());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		if(myCircle.equals(yourCircle)) System.out.println("The two circles are equal");
		else System.out.println("The two circles are not equal");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Enter the x point:");
		double x = keyboard.nextDouble();

		System.out.print("Enter the y point:");
		double y = keyboard.nextDouble();

		System.out.print("radius:");
		double radius = keyboard.nextDouble();

		myCircle.setCircle(x,y,radius);
		System.out.println("After setting myCircle, myCircle: " + myCircle);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		yourCircle = myCircle.getCopy();
		//yourCircle.makeCopy(myCircle);
		System.out.println("After copying myCircle into yourCircle, yourCircle: " + yourCircle);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
}
