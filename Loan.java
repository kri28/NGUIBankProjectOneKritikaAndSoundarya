import java.util.Scanner;

/**
 * @author sour
 *
 */
public class Loan {
	
	void loan(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customers c = new Customers();
		System.out.println("Enter the customer id : ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		System.out.println("Choice");
		System.out.println("1.Housing Loan\n2.Educational Loan\n3.Personal Loan\n4.Travel Loan");
		System.out.println("Enter the type of loan :");
		int ch = sc.nextInt();
		switch(ch){
			case 1: 
				for(CustomerDetails cust : c.customerDetails){
					if(cust.getEmpid()==id){
						if(cust.getBalance()<1000000){
							System.out.println("Loan Rejected");
							break;
						}
						else{
							System.out.println("Enter the loan amount : ");
							int amt = sc.nextInt();
							if(amt<=10000000){
								System.out.println("Loan Granted");
								break;
							}
							else{
								System.out.println("Loan Rejected");
								break;
							}
						}
					}
				}
				break;
				
			case 2:
				System.out.println("Enter your parents id : ");
				int parentid = sc.nextInt();
				for(CustomerDetails cust : c.customerDetails){
					if(cust.getEmpid()==parentid){
						if(cust.getBalance()>=500000){
							System.out.println("Enter the loan amount : ");
							int amt = sc.nextInt();
							if(amt<=10000000){
								System.out.println("Loan Granted");
								break;
							}
							else{
								System.out.println("Loan Rejected");
								break;
							}
						}
						else{
							System.out.println("Loan Rejected");
							break;
						}
					}
				}
				break;
			case 3:
				System.out.println("Enter the loan amount : ");
				int amt = sc.nextInt();
				if(amt<=10000000){
					System.out.println("Loan Granted");
				}
				else{
					System.out.println("Loan Rejected");
				}
				break;
			
			case 4:
				for(CustomerDetails cust : c.customerDetails){
					if(cust.getEmpid()==id){
						if(cust.getBalance()>=5000000){
							System.out.println("Enter the loan amount : ");
							int amount = sc.nextInt();
							if(amount<=10000000){
								System.out.println("Loan Granted");
								break;
							}
							else{
								System.out.println("Loan Rejected");
								break;
							}
						}
						else{
							System.out.println("Loan Rejected");
							break;
						}
					}
				}
				break;
			default : System.out.println("Invalid Choice");
		}

	}

}