import java.awt.im.spi.InputMethod;

public class StaticTest {

	static void add1(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	void add2(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	//main : �ݹ� �Լ�
	public static void main(String[] args) {
		StaticTest st = new StaticTest(); //�ڱ��ڽ��� �ν��Ͻ��� ����
		add1(4, 5);
		st.add2(7, 8);
	}

}


class StaticClass {
	//����ƽ ����
	static int cv;
	//�ν��Ͻ� ����
	int iv;
	
	//����ƽ �޼ҵ�
	static void cMethod() {
		cv = 100;
//		iv = 100;	//�ν��Ͻ��� ���� �� ��������� ������ ������.(iv�� ����)
	}
	
	//�ν��Ͻ� �޼ҵ�
	void iMethod() {
		cv = 300;
		iv = 400;
	}

	static void cMethod2() {//static �޼ҵ忡���� �ν��Ͻ� �޼ҵ� ȣ�� �Ұ�;
		cMethod();
//		iMethod();
	}
	void iMethod2() {//�ν��Ͻ� �޼ҵ忡���� ����ƽ,�ν��Ͻ��޼ҵ� ��� ȣ�Ⱑ��;                                               
		cMethod();
		iMethod();
	}
	
}

