package classTest;

public class Numbers {
	private int num[];

	public Numbers(int[] num) {
		super();
		// {5,6,7,8}
		this.num = num;
	}
	
	// �հ� => ��ȯŸ��: int, �Է°��� ����
	//      => ������� num �迭�� ����ִ� ���� �հ� ����
	
	int getTotal(){
		int sum = 0;
		for(int jumsu:num) {
			sum +=jumsu;
		}
		return sum;
	
	}
	
	// ��� => ��ȯ���� double, �Է°��� ����
	//      => �հ� �޼ҵ带 �̿��ؼ� ��� ���ϱ�
	
	double getAverage() {
		return (double)getTotal()/num.length;
	}
	
}