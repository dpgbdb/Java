package sub2;

public class Car {

	//속성
	private String name;
	private String color;
	private int speed;
	
	//생성자
	public Car(String name, String color, int speed) {
		this.name =name;
		this.color =color;
		this.speed = speed;
		
	}
	//Getter,Setter
	public String getName() {
	return name;
	}
	public void setName(String name) {
		this.name =name;
	}
	public 
	//기능
	public void speedUp(int speed) {
		this.speed+=speed;
	}
	public void speedDown(int speed) {
		this.speed-=speed;
	}
	public void Show() {

		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("차량속도 : "+speed);
		
		
	}
	
	
	
}
