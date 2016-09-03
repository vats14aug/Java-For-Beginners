package com.inheritance;
//EncapsulTION eXAMPLE

class ClasSalary 
{
 private String salary="12000";

public String getSalary(String role) {
	if(role=="MANAGER") //only manager can view his salary
		return salary;
	else 
		return("No access");
}

public void setSalary(String salary, String role) {
	if(role=="ADMIN")
	this.salary = salary;
	else
		System.out.println("no access");
}


}

class ClsEncapsule
{   public static void main(String []args)

	{
	ClasSalary cs=new ClasSalary();
	
	//System.out.println("Salary is"+cs.salary);
	System.out.println(cs.getSalary("MANAGER")); //only manager can view his salary
	System.out.println(cs.getSalary("Team Member")); 
	System.out.println(cs.getSalary("Team Lead"));
	cs.setSalary("15000","ADMIN");//only admin can change the salary
	System.out.println(cs.getSalary("MANAGER"));
	System.out.println(cs.getSalary("Team Member"));
	System.out.println(cs.getSalary("Team Lead"));
	
	}
}
