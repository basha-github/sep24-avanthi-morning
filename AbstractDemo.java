abstract class Bank {
	int balance;

	public Bank(int balance) {
		super();
		this.balance = balance;
	}

	abstract void deposit(int amt);

	abstract void withDraw(int amt);

	void checkBalance() {

		System.out.println("ava balance---->" + this.balance);

	}
}
class ICICIBank extends Bank {

	String name;
	int accNo;

	public ICICIBank(int balance, String name, int accNo) {
		super(balance);
		this.name = name;
		this.accNo = accNo;
	}

	void deposit(int amt) {
		System.out.println("From ICICIBank....");
		if (amt < 500000) {
			this.balance = this.balance + amt;
			System.out.println("Successfully deposited amt-->" + amt);
		} else {
			System.out.println("Sorry... Limit Exceeds...");
		}
	}

	void withDraw(int amt) {
		System.out.println("From ICICIBank....");
		if (amt < 50000) {
			this.balance = this.balance - amt;
			System.out.println("Successfully withDraw amt-->" + amt);
		} else {
			System.out.println("Sorry... Limit Exceeds...");
		}
	}

}

class KotakBank extends Bank {

	String name;
	int accNo;

	public KotakBank(int balance, String name, int accNo) {
		super(balance);
		this.name = name;
		this.accNo = accNo;
	}

	void deposit(int amt) {
		System.out.println("From KotakBank....");
		if (amt < 50000) {
			this.balance = this.balance + amt;
			System.out.println("Successfully deposited amt-->" + amt);
		} else {
			System.out.println("Sorry... Limit Exceeds...");
		}
	}

	void withDraw(int amt) {
		System.out.println("From KotakBank....");
		if (amt < 50000) {
			this.balance = this.balance - amt;
			System.out.println("Successfully withDraw amt-->" + amt);
		} else {
			System.out.println("Sorry... Limit Exceeds...");
		}
	}

}
public class AbstractDemo {

	public static void main(String[] args) {
		Bank bank = null;

		bank = new ICICIBank(10000, "Ramu", 129876);

		bank.deposit(15000);
		bank.checkBalance();

		bank.deposit(75000);
		bank.checkBalance();

		bank = new KotakBank(20000, "Ramya", 128543);

		bank.deposit(15000);
		bank.checkBalance();

		bank.deposit(75000);
		bank.checkBalance();

	}

}
