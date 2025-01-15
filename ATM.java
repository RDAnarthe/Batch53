class ATM{
public void pinChange(){
System.out.println("Pin Changed Successfully---");
}
public void withdrawAmount(){
System.out.println("Withdrawl of 20,000/- is successfully");
}
public void depositeAmount(){
System.out.println("Deposite of 10,000/- is sucessfully");
}
public static void main(String[] args)
{
System.out.println("WELLCOME TO SBI");
ATM a = new ATM();
a.pinChange();
a.withdrawAmount();
a.depositeAmount();
}
}
