import java.util.*;
public class EmployeeWage {
	public static void main(String [] args) {
		int WagePerHour=20;
		int FullDayHour=8;
		int HalfDayHour=4;
		int wage=0;
		System.out.println("Welcome to Employee Wage Computation Program");
		Random rnum = new Random();
		int random = rnum.nextInt(2);
		int halfday= rnum.nextInt(2);
		if ( random == 1)
		{
			System.out.println("Present" + random);
			if ( halfday == 0)
			{
				System.out.println("Employee present for half day only" + halfday);
				wage=WagePerHour*HalfDayHour;
			}
			else
			{
				System.out.println("Employee present for full day" + halfday);
				wage=WagePerHour*FullDayHour;
			}
		}
		else
		{
			System.out.println("Absent" + random);
			wage=0;
		}
		System.out.println("Wage =" +wage);		
	}
}
