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
		System.out.println(this.name + "�� ��ȣ�� " + tel + " �Դϴ�.");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("�ο���>>");
		int n = sc.nextInt();
		Phone[] phone = new Phone[n];

		for (int i = 0; i < n; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
		}

		System.out.println("����Ǿ����ϴ�...");

		while (true) {
			int sum = 0;
			System.out.print("�˻��� �̸�>>");
			String name = sc.next();

			if (name.equals("�׸�"))
				break;

			for (int i = 0; i < n; i++)
				if (phone[i].Search(name)) {
					phone[i].Show();
				} else {
					sum++;
					if (sum == n)
						System.out.println(name + " �� �����ϴ�.");
				}

		}
		sc.close();
	}
}





