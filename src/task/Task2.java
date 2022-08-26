package task;


abstract class Bank {
	abstract void getbalance ();
	double balance;
	
	
}


class BankA extends Bank {
	void getbalance () {
		System.out.println("Deposit 100");  
	}
	
}


class BankB extends Bank {
	void getbalance () {
		System.out.println("Deposit 150");  
	}
	
}


class BankC extends Bank {
	void getbalance () {
		System.out.println("Deposit 200");  
	}
	
}


public class Task2 {

	public static void main(String[] args) {
		
		Bank a = new BankA ();
		a.getbalance();
		
		Bank b = new BankB ();
		b.getbalance();
		
		Bank c = new BankC ();
		c.getbalance();
		
		
		
	}
	
}
