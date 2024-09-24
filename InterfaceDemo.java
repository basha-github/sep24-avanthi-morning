interface ReserveBank {

	public void deposit(int amt);

	public void withDraw(int amt);

	public void checkBalance();
}

class CanaraBank implements ReserveBank {

	String name;
	int accNo;
	int balance;

	public CanaraBank(int balance, String name, int accNo) {
		this.balance = balance;
		this.name = name;
		this.accNo = accNo;
	}

	public void deposit(int amt) {
		System.out.println("From CanaraBank....");
		if (amt < 500000) {
			this.balance = this.balance + amt;
			System.out.println("Successfully deposited amt-->" + amt);
		} else {
			System.out.println("Sorry... Limit Exceeds...");
		}
	}

	public void withDraw(int amt) {
		System.out.println("From CanaraBank....");
		if (amt < 50000) {
			this.balance = this.balance - amt;
			System.out.println("Successfully withDraw amt-->" + amt);
		} else {
			System.out.println("Sorry... Limit Exceeds...");
		}
	}

	public void checkBalance() {
		System.out.println("From Canara Bank");
		System.out.println("Avl Balance....." + this.balance);
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		ReserveBank bank = null;

		bank = new CanaraBank(10000, "Ramu", 129876);

		bank.deposit(15000);
		bank.checkBalance();

		bank.deposit(75000);
		bank.checkBalance();

	}

}
