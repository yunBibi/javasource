package shop;

import java.util.Scanner;

public class MyShop implements iShop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private String sellUser;

	// ��ٱ��� �迭
	private Product[] carts = new Product[10];

	// ȸ������ �迭 - ȸ���̹�, ����Ÿ��
	private User users[] = new User[2];

	// ��ǰ���� �迭 - ��ǰ�̸�, ����, ������
	private Product products[] = new Product[5];

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// �� 2�� ����
		users[0] = new User("ȫ�浿", PayType.CARD);
		users[1] = new User("������", PayType.CASH);
	}

	@Override
	public void genProduct() {
		products[0] = new SmartTv("����Ʈtv1", 300000, "1080");
		products[1] = new SmartTv("����Ʈtv2", 200000, "1080");
		products[2] = new Cellphone("����Ʈ��1", 1000000, "kt");
		products[3] = new Cellphone("����Ʈ��2", 1100000, "lg");
		products[4] = new Cellphone("����Ʈ��3", 1500000, "skt");

	}

	@Override
	public void start() {
		System.out.println(title + ": ���� ȭ�� - ���� ����");
		System.out.println("======================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x] ����");
		System.out.print("���� : ");

		String input = sc.next();
		System.out.println("### " + input + "���� ###");

		switch (input) {
		case "x":
			System.exit(0);
			break;

		default:
			sellUser = input;
			productList();
			break;
		}
	}

	public void productList() {
		System.out.println(title + ": ��ǰ ��� - ��ǰ ����");
		System.out.println("======================");
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetial();
		}
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		System.out.print("���� : ");

		String input = sc.next();

		switch (input) {
		case "h":
			// ����ȭ�� �����ֱ�
			start();

			break;
		case "c":
			checkOut();

			break;

		default:
			// ����ڰ� ������ ��ǰ�� cart�� ���
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(input)];
					break;
				}
			}

			// ��ǰ ��� �����ֱ�
			productList();
			break;

		}
	}

	public void checkOut() {
		System.out.println("## c���� ##");
		System.out.println(title + ": üũ�ƿ�");
		System.out.println("======================");

		int total = 0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i]!=null) {
				System.out.printf("[%d] %s (%d)\n", i, carts[i].getPname(), carts[i].getPrice());
				total +=carts[i].getPrice();
			}
		}
		System.out.println("======================");
		System.out.println("������� : "+users[Integer.parseInt(sellUser)].getPayType());
		System.out.println("�հ� : "+total);
		System.out.println("[p] ����, [q] ���� �Ϸ�");
		System.out.print("���� : ");
		
		String input = sc.next();
		
		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			break;
		default:
			break;
		}
	}
}
