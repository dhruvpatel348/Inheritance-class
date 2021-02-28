import java.util.Scanner;
public class TestExtClock
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		ExtClock myExtClock = new ExtClock(5,4,30,0);
		ExtClock yourExtClock = new ExtClock();

		System.out.print("Initial myExtClock time is, myExtClock:");
		myExtClock.printTime();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Initial yourExtClock time is, yourExtClock:");
		yourExtClock.printTime();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");

		yourExtClock.setZone(5,45,16,5);
		System.out.print("After setting yourExtClock time is, yourExtClock:");
		yourExtClock.printTime();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");

		if(myExtClock.equals(yourExtClock)) System.out.println("The two ExtClocks are equal");
		else System.out.println("The two ExtClocks are not equal");
	    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Enter hours: ");
		int hours = keyboard.nextInt();

		System.out.print("Enter minutes: ");
		int minutes = keyboard.nextInt();

		System.out.print("Enter seconds: ");
		int seconds = keyboard.nextInt();

		System.out.println();

		myExtClock.setZone(hours,minutes,seconds);
		System.out.print("After setting myExtClock time is, myExtClock:");
		myExtClock.printTime();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");

		myExtClock.incrementSeconds();
		System.out.print("After incrementing myExtClock by 1 second is, myExtClock:");
		myExtClock.printTime();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");

		yourExtClock.makeCopy(myExtClock);
		System.out.print("After copying yourExtClock time from myExtClock time is, yourExtClock:");
		yourExtClock.printTime();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
}
