import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//���� ����
		int num1 = 0, num2 =0, result = 0;
		String op = "";
		
		System.out.println("*** ���� ***");	//Ÿ��Ʋ ���
		System.out.print("��1 : ");
		num1 = scan.nextInt();
		System.out.print("��2 : ");
		num2 = scan.nextInt();
		
		System.out.print("���� : ");
		//���ڿ� �Է� ó��
		op = scan.next(); //scan.nextLine();
		
		
//1		//�Է��� ���� ���ڷ� �б�.
//		switch (op) {
//		case "+":
//			result = num1 + num2;
//			break;	//�� case���� �и�
//		case "-":
//			result = num1 + num2;
//			break;
//		case "*":
//			result = num1 + num2;
//			break;
//		case "/":
//			result = num1 + num2;
//			break;
//		case "%":
//			result = num1 + num2;
//			break;
//		default:
//			System.out.println("�߸��� ������ �Է�!");
//			result = 0;	//�����ص� ��
//			break;
//		}//switch ��
//		
//		System.out.println("��� ��� : " + result);
		
//2		if������ ���� ó���غ��� (switch -> if ��ȯ)
//		���ۿ�) 
//		if(op == "+") {
//			result = num1 + num2;
//		}
//		else if(op == "-") {
//			result = num1 + num2;
//		}
//		else if(op == "*") {
//			result = num1 + num2;
//		}
//		else if(op == "/") {
//			result = num1 + num2;
//		}
//		else if(op == "%"){
//			result = num1 + num2;
//		}
//		else{
//			System.out.println("�߸��� ������ �Է�!");
//			result = 0;	//�����ص� ��
//		}
//		System.out.println("��� ��� : " + result);
		
//3		//���������� �񱳸� ���ؼ��� .equals()�� ����ؾ���
//		if(op.equals("+")) {
//			result = num1 + num2;
//		}
//		else if(op.equals("-")) {
//			result = num1 + num2;
//		}
//		else if(op.equals("*")) {
//			result = num1 + num2;
//		}
//		else if(op.equals("/")) {
//			result = num1 + num2;
//		}
//		else if(op.equals("%")){
//			result = num1 + num2;
//		}
//		else{
//			System.out.println("�߸��� ������ �Է�!");
//			result = 0;	//�����ص� ��
//		}
//		System.out.println("��� ��� : " + result);
		
//		switch -> if ��ȯ 
//		���ǻ���: ���ڿ��� ��
//		���ڿ��� �񱳿����ڸ� ����� �� ����
//		1��: ���ڿ�����.equals("�񱳹��ڿ�");
//		2��: ���ڿ�����1.equal(�񱳹��ڿ�����2);
//		3��: "�񱳹��ڿ�".equals(���ڿ�����);  -> �� ������ ���ڿ��� �� ���ϰ� ���ڿ��� ������ ���ص� ��
		
		
		
	}//main ��

}//class ��
//�߰�ȣ ���� �ּ����� ǥ���صθ� ����
