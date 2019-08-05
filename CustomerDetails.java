import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sour
 *
 */
public class CustomerDetails {
	@Override
	public String toString() {
		return "CustomerDetails [phno=" + phno + ", empid=" + empid + ", name=" + name + ", address=" + address
				+ ", balance=" + balance + "]";
	}
	private String phno;
	private int empid;
	private String name;
	private String address;
	private long balance;
	
	
	public CustomerDetails(String phno, int empid, String name, String address, long balance) {
		super();
		this.phno = phno;
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.balance = balance;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

}
class Customers{
	CustomerDetails[] customerDetails = new CustomerDetails[8];
	public Customers(){
		customerDetails[0] = new CustomerDetails("986756454",1,"Kritika","Kolkata",1000000);
		customerDetails[1] = new CustomerDetails("986756454",2,"Soundarya","Chennai",500000);
		customerDetails[2] = new CustomerDetails("986756454",3,"Priya","Delhi",100000);
		customerDetails[3] = new CustomerDetails("986756454",4,"Riya","Goa",5000000);
		customerDetails[4] = new CustomerDetails("986756454",5,"Asha","Noida",500000);
		customerDetails[5] = new CustomerDetails("986756454",6,"Ravi","Mumbai",500000);
		customerDetails[6] = new CustomerDetails("986756454",7,"Kritika","Pune",500000);
		customerDetails[7] = new CustomerDetails("986756454",8,"Kavya","Bangalore",500000);
	}
	@Override
	public String toString() {
		return "Customers [c=" + Arrays.toString(customerDetails) + "]";
	}
	
	
}
