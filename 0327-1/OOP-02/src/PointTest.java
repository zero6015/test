//상속 예시 프로젝트
public class PointTest {

	public static void main(String[] args) {
		
//2		
		Point p1 = new Point();
		ColorPoint cp1 = new ColorPoint();
		Point3D p3_1 = new Point3D();
//		
//		p1.x = 10;
//		p1.y = 20;
//		
//		p3_1.x = 30;
//		p3_1.y = 40;
//		p3_1.z = 50;
//		//클래스가 상속만 된 것이기 때문에 전혀 다른 필드의 x, y 가 만들어짐.

		p1.set(1,2);
		p1.showPoint();
		
		cp1.set(3, 4);
		cp1.setColor("Red");
		cp1.showColorPoint();
	}

}

//1
class Point{//특정 위치를 저장하는데 사용하는 클래스
	private int x;
	private int y;
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
	
}


// 위 두 클래스를 살펴보니까 Point 클래스와 Point3D 클래스의 차이가 int z 밖에 없다. 그렇다면 상속을 활용하여 불필요한 코딩을 줄일 수 있다.

class ColorPoint extends Point{
	private String color;//점의 색상
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}


class Point3D extends Point{//Point클래스를 확장하여 Point3d를 생성한다 -> 확장하여 생성한 클래스이기 때문에 Point3D로 인스턴스 생성 시 int x, y, z 모두 만들어짐.(생성자는 가져올 수 없다)
	int z;
}


//4
//상속과 포함관계를 모두 사용한 새로운 클래스 작성
class Tv{
	private boolean power;
	private int channel;
	
	public void poweron() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
}

class Vcr{
	private boolean power;
	int counter = 0;
	
	public void poweron() {
		power = !power;
	}
	
	public void play() {
		//재생 시작
	}
	
	public void stop() {
		//재생 중단
	}
	
	////....
}

class Tvcr extends Tv{
	Vcr vcr = new Vcr();
	int count = vcr.counter;

	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
}//Tvcr은 Tv 클래스와 Vcr 클래스를 합친 클래스이므로 Tv의 기능을 갖고 잇고 추가로 Vcr의 기능을 쓰려면 vcr의 기능을 실행시킬 수 있도록 인스턴스를 생성해주어야 함.




//3
//예시1) 상속의 계층화
//학생, 알바, 연구원, 교수 클래스
//학생 - 말하기, 먹기, 걷기, 잠자기, 공부하기
//알바 - 말하기, 먹기, 걷기, 잠자기, 공부하기, 일하기
//연구원- 말하기, 먹기, 걷기, 잠자기, 연구하기
//교수 - 말하기, 먹기, 걷기, 잠자기, 연구하기, 가르치기
//
//이 중에서 공통 기능을 하나의 클래스로 뽑아냄
//그 다음 공통 기능끼리 묶어서 상속시킴


class Person{
	public void speaking() {}
	public void eating() {}
	public void walking() {}
	public void sleeping() {}
}

class Student extends Person{
	public void studying() {}
}

class StudentWorker extends Student{
	public void working() {}
}






























