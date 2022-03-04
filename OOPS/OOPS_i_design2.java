//  Main.java
import java.util.*;
import java.io.*;
public class Main {
		public static void main(String[] args) throws IOException{
		//fill your code here
		 InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader sc =new BufferedReader(r); //  Scanner sc = new Scanner(System.in);
		System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account");
		int n = Integer.parseInt(sc.readLine());
		String z = new String();
		if(n == 1){
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
		    z  = sc.readLine();
		    String[] tokens= z.split(",");
			SavingsAccount sa = new SavingsAccount(tokens[0],tokens[1],tokens[2],tokens[3]);
			sa.display();
            // System.out.println(z);
		}
		else if(n == 2){
	
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
		    z = sc.readLine();
		    String[] token= z.split(",");
			CurrentAccount ca = new CurrentAccount(token[0],token[1],token[2],token[3]);
			ca.display();
            // System.out.println(z);
		}
	}
}

// SavingsAccount.java
public class SavingsAccount extends Account{
	//fill your code here
		private String orgName;
	SavingsAccount(String a,String b,String c,String d){
		super(a,b,c);
		orgName = d;
	}
	SavingsAccount(){
	}
	public void setOrgName(String a){orgName = a;
	}
	public String getOrgName(){ return orgName; 
	}
	@Override
	 public void display(){
		super.display();
		System.out.println("Organisation Name:"+orgName);
	}
}

// Account.java
public class Account {
	//fill your code here
	protected String accName , accNo , bankName;
	Account(String a,String b, String c){
		accName = a;
		accNo = b;
		bankName = c;
	}
	Account(){}
	public void setAccName(String a){accName = a;
	}
	public String getAccName(){ return accName; 
	}
	public void setAccNo(String a){accNo = a;
	}
	public String getAccNo(){ return accNo; 
	}
	public void setBankName(String a){bankName = a;
	}

	public String getBankName(){ return bankName; 
	}

	protected void display(){
		System.out.println("Account Name:"+accName);
		System.out.println("Account Number:"+accNo);
		System.out.println("Bank Name:"+bankName);
	}
}

// CurrentAccount.java
public class CurrentAccount extends Account{
	//fill your code here
	private String tinNumber;
	CurrentAccount(String a,String b,String c,String d){
		super(a,b,c);
		tinNumber = d;
	}
	CurrentAccount(){}
	public void setTinNumber(String a){tinNumber = a;
	}
	public String getTinNumber(){ return tinNumber;
	 }
	@Override
	public void display(){
		super.display();
		System.out.println("TIN Number:"+tinNumber);
	}
}
