// IMPSTransfer.java
public class IMPSTransfer extends FundTransfer {

	protected double balance;

	IMPSTransfer(String accountNumber, double balance) {
		setAccountNumber(accountNumber);
		setBalance(balance);
	}

	@Override
	public boolean transfer(double transfer) {
		balance = getBalance();
		double total = transfer + (0.02 * transfer);
		if (total < balance) {
			balance = balance - (transfer + (0.02 * transfer));
			setBalance(balance);
			return true;
		} else
			return false;
	}

}

// RTGSTransfer.java
public class RTGSTransfer extends FundTransfer {

	protected double balance;

	RTGSTransfer(String accountNumber, double balance) {
		setAccountNumber(accountNumber);
		setBalance(balance);
	}

	@Override
	boolean transfer(double transfer) {
		balance = getBalance();
		// double total = transfer + (0.02 * transfer);
		if (transfer > 10000.00) {
			balance = balance - transfer;
			setBalance(balance);
			return true;
		} else
			return false;
	}

}

// NEFTTransfer.java
public class NEFTTransfer extends FundTransfer {

	protected double balance;

	NEFTTransfer(String accountNumber, double balance) {
		setAccountNumber(accountNumber);
		setBalance(balance);
	}

	@Override
	boolean transfer(double transfer) {
		balance = getBalance();
		double total = transfer + (0.05 * transfer);
		if (total < balance) {
			balance = balance - (transfer + (0.05 * transfer));
			setBalance(balance);
			return true;
		} else
			return false;
	}

}

// Main.java
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number:");
		String accNo = sc.next();
		System.out.println("Enter the balance of the account:");
		double balance = sc.nextDouble();
		System.out.println("Enter the type of transfer to be made:\r\n" + "1.NEFT\r\n" + "2.IMPS\r\n" + "3.RTGS");
		int choice = sc.nextInt();
		if (choice == 1) {
			NEFTTransfer neft = new NEFTTransfer(accNo, balance);
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();
			if (neft.validate(transfer) == true)
				if (neft.transfer(transfer) == true) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + neft.getBalance());
				} else
					System.out.println("Transfer could not be made");
			else
				System.out.println("Account number or transfer amount seems to be wrong");
		}
		if (choice == 2) {
			IMPSTransfer imps = new IMPSTransfer(accNo, balance);
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();
			if (imps.validate(transfer) == true)
				if (imps.transfer(transfer) == true) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + imps.getBalance());
				} else
					System.out.println("Transfer could not be made");
			else
				System.out.println("Account number or transfer amount seems to be wrong");
		}
		if (choice == 3) {
			RTGSTransfer rtgs = new RTGSTransfer(accNo, balance);
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();
			if (rtgs.validate(transfer) == true)
				if (rtgs.transfer(transfer) == true) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + rtgs.getBalance());
				} else
					System.out.println("Transfer could not be made");
			else
				System.out.println("Account number or transfer amount seems to be wrong");
		}
	}

}

// FundTransfer.java
public abstract class FundTransfer {

	private String accountNumber;
	private double balance;

	boolean validate(double transfer) {
		if (getAccountNumber().length() == 10 && transfer > 0 && transfer < getBalance())
			return true;
		else
			return false;
	}

	abstract boolean transfer(double transfer);

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
