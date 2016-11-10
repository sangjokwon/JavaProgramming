package tutorial.chapter03;

import java.util.Scanner;

class Employee {
	private String name, phone, pay;

	// 접근자 선언
	public String getname() {
		return name;
	}

	public String getphone() {
		return phone;
	}

	public String getpay() {
		return pay;
	}

	// 설정자 선언
	public void setname(String set_name) {
		name = set_name;
	}

	public void setphone(String set_phone) {
		phone = set_phone;
	}

	public void setpay(String set_pay) {
		pay = set_pay;
	}

}

public class Programming49 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("이름을 입력하세요 : ");
		emp.setname(sc.next());
		
		System.out.println("핸드폰번호를 입력하세요 : ");
		emp.setphone(sc.next());
		
		System.out.println("연봉을 입력하세요 : ");
		emp.setpay(sc.next());
		
		System.out.println("이름 : " + emp.getname() + "핸드폰 : " + emp.getphone() + " 연봉 : " + emp.getpay());
		
	}

}
