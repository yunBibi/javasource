package lamda;

// functional interface
// �޼ҵ� �ϳ��� �����ؾ� ��

@FunctionalInterface    // �ϳ� �̻��� �޼ҵ带 �������� �� �ϵ��� ������. �� ������̼��� ��� ������ ����!
public interface MyNumber {
	int max(int num1,int num2);
	// int min(int num1,int num2);      <-- �Ұ���
}
