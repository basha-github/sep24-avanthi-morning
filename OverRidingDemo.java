class RBIBank {
	int balance;

	public RBIBank(int balance) {
		super();
		this.balance = balance;
	}

	void deposit(int amt) {
		this.balance = this.balance + amt;
	}

	void withDraw(int amt) {
		this.balance = this.balance - amt;
	}

	void checkBalance() {

		System.out.println("ava balance---->" + this.balance);

	}
}

class SBIBank extends RBIBank {

	String name;
	int accNo;

	public SBIBank(int balance, String name, int accNo) {
		super(balance);
		this.name = name;
		this.accNo = accNo;
	}

	void deposit(int amt) {
		System.out.println("From SBIBank....");
		if (amt < 50000) {
			this.balance = this.balance + amt;
			System.out.println("Successfully deposited amt-->" + amt);
		} else {
			System.out.println("Sorry... Limit Exceeds...");
		}
	}

	void withDraw(int amt) {
		System.out.println("From SBIBank....");
		if (amt < 50000) {
			this.balance = this.balance - amt;
			System.out.println("Successfully withDraw amt-->" + amt);
		} else {
			System.out.println("Sorry... Limit Exceeds...");
		}
	}

}

class AxisBank extends RBIBank {

	String name;
	int accNo;

	public AxisBank(int balance, String name, int accNo) {
		super(balance);
		this.name = name;
		this.accNo = accNo;
	}

	void deposit(int amt) {
		System.out.println("From Axis Bank");
		if (amt < 200000) {
			this.balance = this.balance + amt;
			System.out.println("Successfully deposited amt-->" + amt);
		} else {
			System.out.println("Sorry... Limit Exceeds...");
		}
	}

	void withDraw(int amt) {
		System.out.println("From Axis Bank");
		if (amt < 200000) {
			this.balance = this.balance - amt;
			System.out.println("Successfully withDraw amt-->" + amt);
		} else {
			System.out.println("Sorry... Limit Exceeds...");
		}
	}

}

public class OverRidingDemo {

	public static void main(String[] args) {
		RBIBank bank = null;

		bank = new SBIBank(10000, "Ramu", 129876);

		bank.deposit(15000);
		bank.checkBalance();

		bank.deposit(75000);
		bank.checkBalance();

		bank = new AxisBank(20000, "Ramya", 128543);

		bank.deposit(15000);
		bank.checkBalance();

		bank.deposit(75000);
		bank.checkBalance();

	}

}
