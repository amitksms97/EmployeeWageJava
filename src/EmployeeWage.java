import java.util.*;
public class EmployeeWage {
	public static void main(String [] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Random rnum = new Random();
		int random = rnum.nextInt(2);
		if ( random == 1)
			System.out.println("Present" + random);
		else
			System.out.println("Absent" + random);
	}
}
