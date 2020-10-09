package ch4_4;

import java.util.Scanner;

class Phone {
	String name;
	String tel;
	int sum = 0;

	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	boolean Search(String name) {
		if (this.name.equals(name))
			return true;
		else
			return false;

	}

	void Show() {
		System.out.println(this.name + "의 번호는 " + tel + " 입니다.");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("인원수>>");
		int n = sc.nextInt();
		Phone[] phone = new Phone[n];

		for (int i = 0; i < n; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
		}

		System.out.println("저장되었습니다...");

		while (true) {
			int sum = 0;
			System.out.print("검색할 이름>>");
			String name = sc.next();

			if (name.equals("그만"))
				break;

			for (int i = 0; i < n; i++)
				if (phone[i].Search(name)) {
					phone[i].Show();
				} else {
					sum++;
					if (sum == n)
						System.out.println(name + " 이 없습니다.");
				}

		}
		sc.close();
	}
}





