class Company{
public void displayEmployeeDetails()
{
System.out.println("XYZ-9876543210");
}

public void displayEmployeeAddress()
{
System.out.println("Pune19");
}

public void displayCompanyDetails()
{
System.out.println("TCS");
}

public static void main(String[] args)
{
System.out.println("--Main Method--");
Company c = new Company();
c.displayEmployeeDetails();
c.displayEmployeeAddress();
c.displayCompanyDetails();
}
}
