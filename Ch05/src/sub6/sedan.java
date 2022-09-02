package sub6;

public class sedan extends Car{

	private int cc;
	
	public sedan(String name, String color, int speed, int cc) {
		super(name,color,speed);
		this.cc=cc;
	}
	
	@Override
	public void speedUp(int speed) {
		this.speed +=speed+20;
	}
	
	public void speedTurbo() {
		this.speed+=20;
	}
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("차량속도 : "+speed);
		System.out.println("배기량 : "+cc);
	}
}