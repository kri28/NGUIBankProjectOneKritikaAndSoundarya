
public class Employee implements CustDetails{
	private long phno;
	private int empid;
	private String name;
	private String address;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
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
	@Override
	public void checkUserName() {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void checkEmpId() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkPhone() {
		// TODO Auto-generated method stub
		
	}

}
