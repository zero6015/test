import java.util.Scanner;

public class StringCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str1 = "abc";
		String str2 = "abc"; //String str2 = new String("abc"); ������ �̷� �������� �����͸� ������ִ°� ������ String�� ���� ���̱⶧���� new ��ɾ ������ �� ����
		
		
		
		if(str1 == str2) {
			System.out.println("����.");			
		}
		else {
			System.out.println("�����ʴ�.");			
		}
		
		//����1) ==�� ���������͸� ���ϴ� �������̹Ƿ� scan���� ���� ���ϸ� �����ʴٷ� ������� ����
		//abc��� �Ȱ��� ���� �Է¹޾Ƽ� �ٽ� �Է����� �� ������� "�����ʴ�"�� ����
		str2 = scan.next();
		if(str1 == str2) {
			System.out.println("����.");			
		}
		else {
			System.out.println("�����ʴ�.");			
		}
		
		//����2) equals()�� ���������͸� �����־ scan ���� ���� ������ ��� "����"�� ����
		//equals�� ���ϰ� abc�� �Է��ؼ� ���ϸ� "����"�� ����
		str2 = scan.next();
		if(str1.equals(str2)) {
			System.out.println("����.");			
		}
		else {
			System.out.println("�����ʴ�.");			
		}
		
		
	}

}
