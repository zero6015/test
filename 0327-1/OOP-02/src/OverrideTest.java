
public class OverrideTest {

	public static void main(String[] args) {
		TeaInfo coffee = new TeaInfo();
		coffee.setName("아메리카노");
		coffee.setPrice(3000);

//		System.out.println("이름 : " + coffee.getName() + "\n" + "가격 : " + coffee.getPrice());
		System.out.println(coffee);
		
		Point01 p1 = new Point01();
		p1.x = 1;
		p1.y = 2;
		System.out.println(p1.getLocation());
		
		Point3D01 p2 = new Point3D01();
		p2.x = 5;
		p2.y = 6;
		p2.z = 7;
		System.out.println(p2.getLocation());
		//같은 
		
	}
}

class TeaInfo{
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override//source->override->toString 선택함~!
	public String toString() {//객체를 문자열화 시켜주는 메소드
		
		return "이름 : " + name + "\n" + "가격 : " + price;
	}
}


class Point01{
	int x, y;
	
	String getLocation() {
		return "x" + x + ", y :" + y;
	}
}

class Point3D01 extends Point01{
	int z;
	
	@Override //이 표시는 부모클래스의 메소드를 재정의했다는 의미
	String getLocation() {
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
}





