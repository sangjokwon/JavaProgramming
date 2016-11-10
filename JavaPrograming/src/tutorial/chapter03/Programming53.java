package tutorial.chapter03;

//import java.util.Scanner;

class BankAccount {
	public int accountNumber;
	String name;

	void deposit(int a) {
		accountNumber += a;
	}

	void withdraw(int b) {
		accountNumber -= b;
	}

	public int transfer(int accountNumber, BankAccount otherAccount) {
		this.withdraw(accountNumber);
		otherAccount.deposit(accountNumber);
		return 0;
	}

	public BankAccount(int a, String b) {
		accountNumber = a;
		name = b;
	}

	// 시스템 아웃 프린트 하면 이게 나온다
	public String toString() {
		return name + "현재 잔액은 " + accountNumber + "입니다.";
	}
}

public class Programming53 {
	public static void main(String[] args) {

		BankAccount myaccount = new BankAccount(20000, "first");
		BankAccount youaccount = new BankAccount(10000, "second");
		// Scanner sc = new Scanner(System.in);

		System.out.println(myaccount);
		System.out.println(youaccount);

		myaccount.transfer(5000, youaccount);

		System.out.println("5000 first 에서 second로 송금");

		System.out.println(myaccount);
		System.out.println(youaccount);

	}
}
