
public class Class_Ex01 {//���� �̸��� ���� �̸��� Ŭ���� �տ��� public ���� �� ����

	public static void main(String[] args) {
		//�ν��Ͻ� �����. �ν��Ͻ� ���� ����
		Tv myTv = new Tv();
		
		//Tv �ѱ� - power �� ����
		myTv.power = true;
		myTv.power = false;
		myTv.size = 80;
		
		Tv yourTv = new Tv();
		yourTv.power = true;
		yourTv.channel = 11;
		yourTv.volumn = 15;
		
		//�ν��Ͻ��� �޼ҵ� ����� ����
		myTv.onOff();
		myTv.channelChange(3);
		myTv.volumnUp();
		myTv.volumnUp();
		myTv.volumnUp();
		myTv.volumnDown();
		
		//�ѻ�� ���� ����� �ν��Ͻ�
		PersonInfo p1 = new PersonInfo();
		p1.name = "ȫ�浿";
		p1.age = 26;
		p1.phoneNum = "010-1234-5678";
		p1.birth = "2000-03-16";
		p1.gender = "��";
	    p1.address= "��õ�� ����Ȧ��";
	    
	    //10���� ������ �����ϴ� �ν��Ͻ� �迭
	    PersonInfo person[] = new PersonInfo[10];
	    person[0].name = "����ġ";
	    person[0].age = 25;
	    person[0].phoneNum = "010-9876-5432";
	    person[0].birth = "2001-05-15";
	    person[0].gender = "��";
	    person[0].address = "��õ�� ����";
	    
	    //2��° ��� ���� - ������ �迭���� null���� ���� ��.
	    person[0].name = "�ƹ���";
	    person[0].phoneNum = "010-9999-9999";
	    person[0].address = null; // '\0' : 0�� �ش��ϴ� ������ �ʱ�ȭ ����
	
	}

}

//���⿡ Ŭ������ ����� ���ô�.
//1.) TV
//����, ������ - on/off ����, ü��, ���� ����, ũ��
//����(state)�� �����͸� �����ϴ� �ʵ�(field)��� ��.
//�ʵ�� �������� �����ϴ� �ʵ�� ��� ó�� �� �ʿ��� �������� �����ϴ� �ʵ尡 ����.
class Tv {//�տ� ���������� �����Ǿ����� ��� default�� �����Ȱ�!
	//���� �ʵ� ����
	boolean power;	//���������� ���� �����ϴ� �������(�������̳� �ٸ� �ڷ������� ���� ������൵ ��) �̷� ���¸� ������ �� �ִ� ������ �������ִ� ���� �߿�!
	int channel; 
	int volumn;
	//���� �ʵ� ����
	int size;
	String maker;
	
	public void onOff() {
		//Tv�� power�� ������ �� �մ� ����� ����
//		if(power == true) {
//			power = false;
//		}
//		else {
//			power = true;
//		}
		
		power = !power;	//���� if���� ���ٷ� �����ϰ� ǥ���� �� ����.
	}
	
	//��ȣ�� �޾Ƽ� ä�� ����
	public void channelChange(int num) {
		channel = num;
		System.out.println("ä�� ���� : " + channel);
	}
	
	//���� ����. �ѹ� ������ 1�� ����.
	public void volumnUp() {
		volumn++;
		System.out.println("���� : " + volumn);
	}
	public void volumnDown() {
		volumn--;
		System.out.println("���� : " + volumn);
	}
}

//Tvó�� ������, ����, å class�� ������ ����.
class Aircon{
	//���� �ʵ�
	boolean power;
	int windpower;
	int winddirection;
	int now_temperature, set_temperature;
	//���� �ʵ�
	String maker;
	int size;
}

class Chair{
	int lheight, lwidth, lvertical;
	int bheight, bwidth, bvertical;
	int mheight, mwidth, mvertical;
	int wheel,rwheel;
	String meterial;
}

class Book{
	//���� �ʵ�
	String title;
	String text;
	String genre;//�帣
	String author;
	String publisher;
	String ISBN; //å ������ȣ
	//���� �ʵ�
	int chapter;
	int price;
}


//2.)��ü�� ����
//1. �ϼ�ǰ�� �ش��ϴ� ��ü = ���α׷�
//2. ��ǰ�� �ش��ϴ� ��ü
//3. ������ �����ϴ� ��ü
//
//NEXT) ����� class�� ������ ����.
//����ó ���α׷��� ���� ó����
//Data Transfer Object(DTO)
class PersonInfo{
	//�����ʵ�
	String name;
	String phoneNum;
	String birth;
	String gender;
	String address;
	int age;
	
}
//NEXT) �ڵ��� class�� ������ ����.
















