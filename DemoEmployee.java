/**
 * 
 */
package employee;

/**
 * @author Hamsira Pathan and Kaiyin Chen
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcastingpolymorphism
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete
		// emp3.whoAmI() // prints ... because ... 
		// Answer: Print "PART TIME EMPLOYEE" because emp3 equal to pEmp1 and pEmp1 is PartTimeEmployee. The whoAmI() method in PartTimeEmployee override the whoAmI() method in Employee.

		// emp3.getHourlyRate(); // returns syntax error because 
		// Answer: return syntax error the object of emp3 is Employee and Employee doesn't have getHourlyRate() method. getHourlyRate() method belong to PartTimeEmployee and it is the subclass of Employee.

		// TODO To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		if (emp3 instanceof PartTimeEmployee) {
		 System.out.println("emp3 instance of part time employee"); // printed
		} else {
			System.out.println("emp3 not instance of part time employee");
		}

		// Downcasting 1
		// TODO Uncomment and run the code
		// PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// Answer: print "Exception in thread "main" java.lang.ClassCastException: class employee.Employee cannot be cast to class employee.PartTimeEmployee (employee.Employee and employee.PartTimeEmployee are in unnamed module of loader 'app')
		//	at employee.DemoEmployee.main(DemoEmployee.java:51)"
		 
		// TODO To complete
		// This instruction compiles / does not compile
		// This instruction returns a ClassCastException at run time
		// because ...
		// Answer: Because Employee is superclass and is doesn't inherits the methods and classes in superclass (PartTimeEmployee). But subclass can used the methods and classes in superclass.

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
