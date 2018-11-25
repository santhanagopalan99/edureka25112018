package day2;

public class Employee {
	int salary;
	int bonus;
	void calculateSalary()
	{
		int totalsalary=salary+bonus;
		System.out.println("Printing total salary" + totalsalary);
	}

}
